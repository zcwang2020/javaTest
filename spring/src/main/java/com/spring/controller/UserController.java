/**
 * @(#)UserController.java, 2022/9/9.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.spring.service.UserService;

/**
 * @Author zcwang
 * @Date 2022/9/9
 */
@Controller
public class UserController {

    @Autowired
    @Qualifier("service") // 指定bean的id
    private UserService userService;

    public void saveUser() {
        userService.saveUser();
    }
}