package com.ys.mvc.controller;

import com.ys.mvc.pojo.Students;
import com.ys.mvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yunshan on 17/9/25.
 */

@Controller
@RequestMapping("/students")
public class StudentsController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/save")
    public void saveStudents(@RequestBody Students students) throws Exception {
        studentService.insertStudent(students);
    }
}
