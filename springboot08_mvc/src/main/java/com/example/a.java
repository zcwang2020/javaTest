package com.example;

/**
 * @Author wzc
 * @Date 2022/10/23
 */
@DataJdbc1("a")
public class a {
    public static void main(String[] args) {
        System.out.println("a.class.getAnnotations() = " + a.class.getDeclaredAnnotations());
    }
}

