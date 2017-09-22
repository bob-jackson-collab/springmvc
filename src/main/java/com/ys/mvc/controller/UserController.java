package com.ys.mvc.controller;

import com.ys.mvc.pojo.User;
import com.ys.mvc.pojo.Users;
import com.ys.mvc.service.UserService;
import com.ys.mvc.serviceimp.UserServiceImp;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by yunshan on 17/9/15.
 */

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/users")
    @ResponseBody
    public List<Users> getUsers(@RequestBody Users users) {

        if ("yangsong".equals(users.getUsername()) && "123".equals(users.getUserpasswd())) {
            return userService.getUsers();
        }
        return null;
    }
}
