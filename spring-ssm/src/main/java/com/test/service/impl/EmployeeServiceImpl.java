/**
 * @(#)EmployeeServiceImpl.java, 2022/9/22.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.test.service.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.mapper.EmployeeMapper;
import com.test.pojo.Employee;
import com.test.service.EmployeeService;

/**
 * @Author zcwang
 * @Date 2022/9/22
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeMapper.seleteAll();
    }
}