package com.eli.springbootvue.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: tmind
 * @Date: 2024/1/29 17:14
 * @Description:
 */
public class TraceHandler implements InvocationHandler {

    private Object target;

    public TraceHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.print(target);
        System.out.print("." + method.getName() + "---");
        if (args != null) {
            for (Object arg : args) {
                System.out.print("arg: " + arg);
            }
        }
        System.out.println("---");
        return method.invoke(target, args);
    }
}
