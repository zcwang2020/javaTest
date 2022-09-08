/**
 * @(#)UserFactoryBean.java, 2022/9/8.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.spring.factory;

import org.springframework.beans.factory.FactoryBean;

import com.spring.pojo.User;

/**
 * @Author zcwang
 * @Date 2022/9/8
 */
public class UserFactoryBean implements FactoryBean<User> {
    public User getObject() throws Exception {
        return new User();
    }

    public Class<?> getObjectType() {
        return User.class;
    }
}