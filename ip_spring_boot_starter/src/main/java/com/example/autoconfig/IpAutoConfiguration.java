/**
 * @(#)IpAutoConfiguration.java, 2022/10/24.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.example.autoconfig;

import com.example.properties.IpProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;

import com.example.service.IpCountService;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author zcwang
 * @Date 2022/10/24
 */
@Import({IpCountService.class, IpProperties.class})
// @EnableConfigurationProperties(IpProperties.class)
@EnableScheduling
public class IpAutoConfiguration {
}