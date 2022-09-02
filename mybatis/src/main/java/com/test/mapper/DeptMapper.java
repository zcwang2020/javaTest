/**
 * @(#)DeptMapper.java, 2022/9/2.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.test.pojo.Dept;

/**
 * @Author zcwang
 * @Date 2022/9/2
 */
public interface DeptMapper {

    /**
     * 根据id查询部门
     * @param deptId
     * @return
     */
    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptId);

    /**
     * 获取部门和所有员工信息
     * @param deptId
     * @return
     */
    List<Dept> getDeptAndAllEmp(@Param("deptId") Integer deptId);

    /**
     * 分步查询部门及员工信息
     * @param deptId
     * @return
     */
    Dept getDeptAndAllEmpStepOne(@Param("deptId") Integer deptId);
}