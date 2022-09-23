/**
 * @(#)EmployeeMapper.java, 2022/9/22.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.test.mapper;

import java.util.List;

import com.test.pojo.Employee;

/**
 * @Author zcwang
 * @Date 2022/9/22
 */
public interface EmployeeMapper {

    List<Employee> seleteAll();
}