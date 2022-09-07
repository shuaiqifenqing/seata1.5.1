package com.jack.controller;

import com.jack.entity.Employee;
import com.jack.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/test222")
    public Integer test(){
        Employee student = new Employee();
        student.setDepartmentId(1);
        student.setSalary(12.01);
        student.setName("大哥大");
        return employeeService.insertIntoEmployee(student);
    }
}
