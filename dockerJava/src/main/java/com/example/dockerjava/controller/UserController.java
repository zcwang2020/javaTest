/**
 * @(#)UserController.java, 2023/3/7.
 * <p/>
 * Copyright 2023 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.example.dockerjava.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.example.dockerjava.entity.User;
import com.example.dockerjava.mapper.UserMapper;

/**
 * @Author zcwang
 * @Date 2023/3/7
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/getUser")
    public String getUser(@RequestParam Long userId) {

        User user = userMapper.selectByPrimaryKey(userId);

        User user1 = userMapper.selectByName(userId.toString());
        List<User> userList = Arrays.asList(user, user1);
        return JSON.toJSONString(userList);
    }
}