/**
 * @(#)JoinTest.java, 2022/11/25.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package work;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;

/**
 * @Author zcwang
 * @Date 2022/11/25
 */
public class JoinTest {

    public static void main(String[] args) {
        Wei wei1 = new Wei("a", 1, 1);
        Wei wei2 = new Wei("b", 2, 2);
        Wei wei3 = new Wei("c", 3, 3);
        List<Wei> a = new ArrayList<>();
        a.add(wei1);
        a.add(wei2);
        a.add(wei3);
        List<String> collect = a.stream().map(i -> i.getName() + i.getAge()).collect(Collectors.toList());
        String join = StringUtils.join(collect, ",");
        System.out.println("join = " + join);
    }
}