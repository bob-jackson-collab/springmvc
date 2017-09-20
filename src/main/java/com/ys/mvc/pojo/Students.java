package com.ys.mvc.pojo;

public class Students {
    private Integer id;

    private String studentName;

    private String studentPasswd;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getStudentPasswd() {
        return studentPasswd;
    }

    public void setStudentPasswd(String studentPasswd) {
        this.studentPasswd = studentPasswd == null ? null : studentPasswd.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}