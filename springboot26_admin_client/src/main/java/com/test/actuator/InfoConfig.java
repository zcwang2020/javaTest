/**
 * @(#)InfoConfig.java, 2022/10/13.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.test.actuator;

import java.util.HashMap;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

/**
 * @Author zcwang
 * @Date 2022/10/13
 */

@Component
public class InfoConfig implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("runTime", System.currentTimeMillis());
        HashMap<String, Object> infoMap = new HashMap<>();
        infoMap.put("buildTime", "2022");
        builder.withDetails(infoMap);
    }
}