/**
 * @(#)EmployeeController.java, 2022/9/22.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.pojo.Employee;
import com.test.service.EmployeeService;

/**
 * @Author zcwang
 * @Date 2022/9/22
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public String getAllEmployee(Model model) {
        List<Employee> list = employeeService.getAllEmployee();
        model.addAttribute("list", list);
        return "employee_list";
    }
}