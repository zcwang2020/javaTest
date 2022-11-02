/**
 * @(#)WhileTest.java, 2022/10/27.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.util.CollectionUtils;

/**
 * @Author zcwang
 * @Date 2022/10/27
 */
public class WhileTest {
    public static void main(String[] args) {
        long ssrId = 0L;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        while (true) {
            if (CollectionUtils.isEmpty(list)) {
                break;
            }
            list.clear();
        }
        System.out.println("end");
    }
}