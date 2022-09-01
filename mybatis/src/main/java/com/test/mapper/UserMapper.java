/**
 * @(#)UserMapper.java, 2022/9/1.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.test.mapper;

import java.util.List;

import com.test.pojo.User;

/**
 * @Author zcwang
 * @Date 2022/9/1
 */
public interface UserMapper {

    /**
     * 添加用户信息
     * @return
     */
    int insertUser();

    /**
     * 更新用户信息
     */
    void updateUser();

    void deleteUser();

    List<User> getAllUser();
}