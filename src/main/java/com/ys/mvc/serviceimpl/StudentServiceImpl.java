package com.ys.mvc.serviceimpl;

import com.ys.mvc.mapper.StudentsMapper;
import com.ys.mvc.pojo.Students;
import com.ys.mvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yunshan on 17/9/25.
 */

@Service(value = "Student")
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentsMapper studentsMapper;

    public int insertStudent(Students record) throws Exception {
        return studentsMapper.insert(record);

    }
}
