/**
 * @(#)IpAutoConfiguration.java, 2022/10/24.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.example.autoconfig;

import org.springframework.context.annotation.Import;

import com.example.service.IpCountService;

/**
 * @Author zcwang
 * @Date 2022/10/24
 */
@Import(IpCountService.class)
public class IpAutoConfiguration {
}