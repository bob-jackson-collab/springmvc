package com.ys.mvc.pojo;

/**
 * Created by yunshan on 17/9/18.
 */
public class Users {

    private Integer id;
    private String username;
    private String userpasswd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpasswd() {
        return userpasswd;
    }

    public void setUserpasswd(String userpasswd) {
        this.userpasswd = userpasswd;
    }
}
