package com.jack.dao;

import com.jack.entity.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper {
    @Insert("insert into employee values(null,#{name},#{salary},#{departmentId})")
    int insertIntoEmployee(Employee student);
}
