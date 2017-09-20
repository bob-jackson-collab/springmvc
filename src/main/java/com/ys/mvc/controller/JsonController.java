package com.ys.mvc.controller;

import com.ys.mvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yunshan on 17/9/14.
 */
@Controller
public class JsonController {

    @RequestMapping("/json")
    @ResponseBody
    public List<User> getList() {
        List<User> list = new ArrayList<User>();
        list.add(new User(1, "22", "22"));
        list.add(new User(2, "23", "23"));
        list.add(new User(3, "24", "24"));
        return list;
    }
}
