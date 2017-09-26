package com.ys.mvc.mapper;

import com.ys.mvc.pojo.DriverRecord;

public interface DriverRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DriverRecord record);

    int insertSelective(DriverRecord record);

    DriverRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DriverRecord record);

    int updateByPrimaryKey(DriverRecord record);
}