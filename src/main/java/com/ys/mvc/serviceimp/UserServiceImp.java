package com.ys.mvc.serviceimp;

import com.ys.mvc.mapper.UsersMapper;
import com.ys.mvc.pojo.Users;
import com.ys.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yunshan on 17/9/15.
 */

@Service("UserService")
public class UserServiceImp implements UserService {

    @Autowired
    UsersMapper usersMapper;

    public List<Users> getUsers() {


        return usersMapper.get();
    }
}
