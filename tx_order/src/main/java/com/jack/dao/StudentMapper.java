package com.jack.dao;

import com.jack.entity.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
    @Insert("insert into student values(null,#{name},#{age})")
    int insertIntoStudent(Student student);
}
