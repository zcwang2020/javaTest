/**
 * @(#)AddTest.java, 2021/11/29.
 * <p/>
 * Copyright 2021 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package work;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author Tmind
 * @Date 2021/11/29
 */
public class AddTest {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.addAll(b);
        System.out.println(a);


        a.add(1);
        a.add(2);
        // 倒叙，由大到小
        List<Integer> collect = a.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).collect(Collectors.toList());
        System.out.println(collect);

        String s = "1311_00000001";
        System.out.println(s.length());

    }

}