/**
 * @(#)BooleanTest.java, 2022/11/7.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package work;

import java.util.ArrayList;

import org.apache.commons.collections4.Get;

import javafx.concurrent.Worker;

/**
 * @Author zcwang
 * @Date 2022/11/7
 */
public class BooleanTest {
    public static void main(String[] args) {

        Boolean aBoolean = get();
        System.out.println("aBoolean = " + aBoolean);


        Boolean flag = true;
        Integer num = 12;
        Wei wei = new Wei("2", 2, 2);
        Wei wei2 = new Wei("3", 3, 3);
        ArrayList<Wei> list = new ArrayList();
        list.add(wei);
        list.add(wei2);
        // System.out.println("flag = " + flag + " num = " + num + " wei = " + wei);
        System.out.println("old list = " + list);
        change(flag, num, wei, list);
        // System.out.println("flag = " + flag + " num = " + num + " wei = " + wei);
        System.out.println("old list = " + list);
    }

    private static void change(Boolean flag, Integer num, Wei wei, ArrayList<Wei> list) {
        flag = false;
        num = 15;
        // wei.setAge(5);
        wei = new Wei("2", 5, 2);
        // list.remove(0);
        Wei wei3 = new Wei("2", 2, 2);
        Wei wei4 = new Wei("3", 3, 3);
        list = new ArrayList();
        list.add(wei3);
        list.add(wei4);
        list.remove(0);
        System.out.println("new list = " + list);
    }

    public static Boolean get() {
        int aa = 11;
        switch (aa) {
            case 11:
                return true;
            default:
                return false;
        }
    }
}