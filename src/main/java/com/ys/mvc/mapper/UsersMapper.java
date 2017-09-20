package com.ys.mvc.mapper;

import com.ys.mvc.pojo.User;
import com.ys.mvc.pojo.Users;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by yunshan on 17/9/15.
 */

@Component
public interface UsersMapper {

    List<Users> get();
}
