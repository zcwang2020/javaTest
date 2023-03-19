/**
 * @(#)TestController.java, 2023/3/3.
 * <p/>
 * Copyright 2023 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.example.dockerjava.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zcwang
 * @Date 2023/3/3
 */
@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/docker")
    public String helloDocker() {
        return "hello docker \t" + port + "\t" + UUID.randomUUID().toString();
    }
}