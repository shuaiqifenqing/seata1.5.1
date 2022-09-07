package com.jack.controller;

import com.jack.entity.Student;
import com.jack.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    int a=9;

    @Autowired
    private StudentService studentService;

    @RequestMapping("/test")
    public Integer test(){
        Student student = new Student();
        student.setId(a++);
        student.setAge(a++);
        student.setName("小名"+a);
        return studentService.insertIntoStudent(student);
    }
}
