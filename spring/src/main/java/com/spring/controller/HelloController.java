/**
 * @(#)HelloControllr.java, 2022/9/14.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author zcwang
 * @Date 2022/9/14
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "index";
    }
}