package com.ys.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/**
 * Created by yunshan on 17/9/28.
 */

@Controller
@RequestMapping("/file")
public class FileUploadController {


    //单个文件上传
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public String uploadFile(@RequestParam("file") MultipartFile file, HttpServletRequest request) {

        try {
            if (!file.isEmpty()) {
                //上传文件路径
                String path = request.getSession().getServletContext().getRealPath("upload/images/");
                //上传文件名
                String filename = file.getOriginalFilename();
                File filepath = new File(path, filename);
                //判断路径是否存在，如果不存在就创建一个
                if (!filepath.getParentFile().exists()) {
                    filepath.getParentFile().mkdirs();
                }
                //将上传文件保存到一个目标文件当中
                file.transferTo(new File(path + File.separator + filename));
                return "11";
            }
        } catch (Exception e) {
            e.fillInStackTrace();
        }
        return "00";
    }

    //多文件上传
    @RequestMapping(value = "uploads", method = RequestMethod.POST)
    public void multipartFiles(HttpServletRequest request) {

        long startTime = System.currentTimeMillis();
        //将当前上下文初始化给  CommonsMutipartResolver （多部分解析器）
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
                request.getSession().getServletContext());
        //检查form中是否有enctype="multipart/form-data"
        if (multipartResolver.isMultipart(request)) {
            //将request变成多部分request
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            //获取multiRequest 中所有的文件名
            Iterator iter = multiRequest.getFileNames();
            while (iter.hasNext()) {
                //一次遍历所有文件
                MultipartFile file = multiRequest.getFile(iter.next().toString());
                if (file != null) {
                    String path = "/Users/yunshan/Desktop/springUpload" + file.getOriginalFilename();
                    //上传
                    try {
                        file.transferTo(new File(path));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }

        }
        long endTime = System.currentTimeMillis();
        System.out.println("方法三的运行时间：" + String.valueOf(endTime - startTime) + "ms");
    }
}
