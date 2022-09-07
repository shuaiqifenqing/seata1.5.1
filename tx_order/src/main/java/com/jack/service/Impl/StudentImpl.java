package com.jack.service.Impl;

import com.jack.dao.StudentMapper;
import com.jack.entity.Student;
import com.jack.service.StorageFeign;
import com.jack.service.StudentService;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private StorageFeign storageFeign;

    @Override
    @GlobalTransactional
    public int insertIntoStudent(Student student) {
        System.out.println("订单传的xid:"+ RootContext.getXID());
        int result = studentMapper.insertIntoStudent(student);
        Integer test = storageFeign.test();
        int a =1/0;
        System.out.println("输出结果:"+result);
        return result;
    }
}
