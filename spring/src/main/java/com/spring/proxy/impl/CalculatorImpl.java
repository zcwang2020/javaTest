package com.spring.proxy.impl;

import com.spring.proxy.Calculator;

/**
 * @Author wzc
 * @Date 2022/9/11
 */
public class CalculatorImpl implements Calculator {

    public Integer add(Integer a, Integer b) {
        System.out.println("方法内部");
        return a + b;
    }

    public Integer subtract(Integer a, Integer b) {
        System.out.println("方法内部");
        return a - b;
    }

    public Integer multiply(Integer a, Integer b) {
        System.out.println("方法内部");
        return a * b;
    }

    public Integer divide(Integer a, Integer b) {
        System.out.println("方法内部");
        return a / b;
    }
}
