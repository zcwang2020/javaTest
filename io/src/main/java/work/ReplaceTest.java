/**
 * @(#)ReplaceTest.java, 2022/2/17.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package work;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author zcwang
 * @Date 2022/2/17
 */
public class ReplaceTest {
    public static void main(String[] args) {
        String name = "123";
        System.out.println(name.replaceFirst(name.substring(2), "*"));

        long time = 11L;
        int interval = 1;
        BigDecimal a  = BigDecimal.valueOf(2.4);
        System.out.println(new BigDecimal(time / interval));
        BigDecimal add = a.add(BigDecimal.ONE);
        System.out.println(add);
        System.out.println(new BigDecimal(time * interval).multiply(add));
        System.out.println(new BigDecimal(time * interval).multiply(add).setScale(0, BigDecimal.ROUND_HALF_UP).longValue());

        List<Integer> list1 = new ArrayList<>();
        System.out.println(list1.size());

    }
}