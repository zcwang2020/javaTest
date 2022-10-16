/**
 * @(#)MyBeanProcessor.java, 2022/9/8.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.spring.progress;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author zcwang
 * @Date 2022/9/8
 */
public class MyBeanProcessor implements BeanPostProcessor{

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("before init com.baima.bean, name = " + beanName);
        return null;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("after init com.baima.bean, name = " + beanName);
        return bean;
    }
}