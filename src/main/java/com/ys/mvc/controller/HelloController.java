package com.ys.mvc.controller;

import com.ys.mvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by yunshan on 17/9/13.
 */

@Controller
public class HelloController {

    @RequestMapping("/spring")
    public String sayHello() {
        System.out.println("hello world");
        return "redirect:hello";
    }

    @RequestMapping("/hello")
    public void resultApi(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
//        req.getHeaders("value");
        resp.setCharacterEncoding("UTF-8");

        resp.getWriter().print("杨松");
//        resp.sendRedirect("jsp/index.jsp");
//        req.setAttribute("msg", "hello");
//        req.getRequestDispatcher("jsp/index.jsp").forward(req, resp);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public void user(User user) {

        System.out.println(user.toString());
    }


    @RequestMapping("/test/{id}/{uid}")
    public void name(@PathVariable String id, @PathVariable String uid) {
        System.out.println(id + "===" + uid);
    }

}
