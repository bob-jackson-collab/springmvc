package com.ys.mvc.controller;

import com.ys.mvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by yunshan on 17/9/14.
 */

@Controller
public class LoginController {


    @RequestMapping("/login")
    public String login(User user, HttpSession session) {

        if ("yangsong".equals(user.getName()) && "123".equals(user.getPwd())) {
            session.setAttribute("user", user);
            return "index";
        }

        return "redirect:/jsp/login.jsp";
    }


    @RequestMapping("/add")
    public String add() {
        return "redirect:jsp/login.jsp";
    }
}
