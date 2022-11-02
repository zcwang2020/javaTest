/**
 * @(#)IpCountService.java, 2022/10/24.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.example.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import com.example.properties.IpProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @Author zcwang
 * @Date 2022/10/24
 */
public class IpCountService {

    private Map<String, Integer> ipCountMap = new HashMap<>();

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private IpProperties ipProperties;

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

    @Scheduled(cron = "0/#{ipProperties.cycle} * * * * ?")
    public void print() {
        if (ipProperties.getModel().equals(IpProperties.modelEnum.DETAIL.getType())) {
            System.out.println("----IP访问监控detail------------------");
            System.out.println("+---ip------+----------num----+");
            for (Map.Entry<String, Integer> entry : ipCountMap.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                System.out.println(String.format("|%18s     |%5d   |", key, value));
            }
            System.out.println("+------+------+----------+");
        } else if (ipProperties.getModel().equals(IpProperties.modelEnum.SIMPLE.getType())) {
            System.out.println("----IP访问监控simple------------------");
            System.out.println("+---ip------+-----------------+");
            Set<String> strings = ipCountMap.keySet();
            for (String string : strings) {
                System.out.println(String.format("|%18s        |", string));
            }
            System.out.println("+------+------+----------+");
        }
        if (ipProperties.getCycleReset()) {
            ipCountMap.clear();
        }
    }
}