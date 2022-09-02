/**
 * @(#)EmpMapper.java, 2022/9/2.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.test.pojo.Emp;

/**
 * @Author zcwang
 * @Date 2022/9/2
 */
public interface EmpMapper {

    /**
     * 根据id获取员工
     * @param empId
     * @return
     */
    Emp getEmpById(@Param("empId") Integer empId);

    /**
     * 查询员工信息及部门信息
     * @param empId
     * @return
     */
    Emp getEmpAndDept(@Param("empId") Integer empId);

    /**
     * 分布查询
     * @param empId
     * @return
     */
    Emp getEmpAndDeptByStepOne(@Param("empId") Integer empId);

    /**
     * 根据部门查询员工信息
     * @param deptId
     * @return
     */
    List<Emp> getDeptAndAllEmpStepTwo(@Param("deptId") Integer deptId);
}