package com.ys.mvc.serviceimpl;

import com.ys.mvc.mapper.StudentsMapper;
import com.ys.mvc.pojo.Students;
import com.ys.mvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by yunshan on 17/9/25.
 */

public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentsMapper studentsMapper;

    public int insert(Students record) throws Exception {
        Students students = new Students();
        students.setStudentName("ali");
        students.setStudentPasswd("111");
        return studentsMapper.insert(students);

    }
}
