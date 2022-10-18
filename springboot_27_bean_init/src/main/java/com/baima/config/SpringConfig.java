/**
 * @(#)SpringConfig.java, 2022/10/18.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.baima.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;

import com.baima.bean.Cat;

/**
 * @Author zcwang
 * @Date 2022/10/18
 */
public class SpringConfig {

    @Bean
    // @ConditionalOnClass(name = "com.baima.bean.Wolf")
    @ConditionalOnMissingClass("com.baima.bean.Wolf")
    public Cat tom() {
        return new Cat();
    }
}