package com.jack.service.Impl;

import com.jack.dao.EmployeeMapper;
import com.jack.entity.Employee;
import com.jack.service.EmployeeService;

import io.seata.core.context.RootContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public int insertIntoEmployee(Employee student) {
        System.out.println("库存传的xid:"+ RootContext.getXID());
        int result = employeeMapper.insertIntoEmployee(student);
        System.out.println("库存输出结果:"+result);
        return result;
    }
}
