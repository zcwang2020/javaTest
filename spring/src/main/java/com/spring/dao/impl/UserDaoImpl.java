/**
 * @(#)UserDaoImpl.java, 2022/9/9.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.spring.dao.impl;

import org.springframework.stereotype.Repository;

import com.spring.dao.UserDao;

/**
 * @Author zcwang
 * @Date 2022/9/9
 */
@Repository
public class UserDaoImpl implements UserDao {
    public void saveUser() {
        System.out.println("保存成功");
    }
}