/**
 * @(#)ResultMapTest.java, 2022/9/2.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.test.mapper.DeptMapper;
import com.test.mapper.EmpMapper;
import com.test.pojo.Dept;
import com.test.pojo.Emp;
import com.test.utils.SqlSessionUtil;

/**
 * @Author zcwang
 * @Date 2022/9/2
 */
public class ResultMapTest {

    @Test
    public void getEmpById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpById(1);
        System.out.println(emp);
    }

    @Test
    public void getEmpAndDept() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDept(1);
        System.out.println(emp);
    }

    @Test
    public void getEmpAndDeptStep() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptByStepOne(1);
        System.out.println(emp);
    }

    @Test
    public void getDeptAndEmp() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        List<Dept> deptAndAllEmp = mapper.getDeptAndAllEmp(1);
        System.out.println(deptAndAllEmp);
    }

    @Test
    public void getDeptAndEmpStep() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptAndAllEmp = mapper.getDeptAndAllEmpStepOne(1);
        System.out.println(deptAndAllEmp.getDeptName());
    }
}