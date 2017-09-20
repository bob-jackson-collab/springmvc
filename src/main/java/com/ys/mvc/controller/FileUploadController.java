package com.ys.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;

/**
 * Created by yunshan on 17/9/14.
 */

@Controller
public class FileUploadController {

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public void upload(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request) throws Exception {

        String path = request.getRealPath("/file");

        System.out.println(file.getOriginalFilename());

        InputStream is = file.getInputStream();

        File file1 = new File(path, file.getOriginalFilename());

        if (!file1.exists())
            file1.createNewFile();

        OutputStream os = new FileOutputStream(file1);

        int length = 0;

        byte[] buffer = new byte[400];

        while ((length = is.read(buffer)) != -1) {
            os.write(buffer, 0, length);
        }

        is.close();
        os.close();
    }

}
