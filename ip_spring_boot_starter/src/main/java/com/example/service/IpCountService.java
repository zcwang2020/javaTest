/**
 * @(#)IpCountService.java, 2022/10/24.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.example.service;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author zcwang
 * @Date 2022/10/24
 */
public class IpCountService {

    private Map<String, Integer> ipCountMap = new HashMap<>();

    @Autowired
    private HttpServletRequest request;

    public void count() {
        String ip = request.getRemoteAddr();
        System.out.println("----------------------" + ip);
        Integer count = ipCountMap.get(ip);
        if (count == null) {
            ipCountMap.put(ip, 1);
        } else {
            ipCountMap.put(ip, count + 1);
        }
    }
}