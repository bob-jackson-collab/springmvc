package com.ys.mvc.mapper;

import com.ys.mvc.pojo.Students;
import org.mybatis.spring.annotation.MapperScan;

public interface StudentsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Students record);

    int insertSelective(Students record);

    Students selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Students record);

    int updateByPrimaryKey(Students record);
}