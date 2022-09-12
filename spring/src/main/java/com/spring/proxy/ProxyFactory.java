package com.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @Author wzc
 * @Date 2022/9/11
 */
public class ProxyFactory implements Calculator {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        ClassLoader loader = this.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler h = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try {
                    System.out.println("目标方法前，方法名：" + method.getName() + "，参数：" + Arrays.toString(args));
                    result = method.invoke(target, args);
                    System.out.println("目标方法后，结果：" + result);
                } catch (Exception e) {
                    System.out.println("目标方法异常"+e);
                    e.printStackTrace();
                } finally {
                    System.out.println("finally");
                }
                return result;
            }
        };
        return Proxy.newProxyInstance(loader, interfaces, h);
    }

    public Integer add(Integer a, Integer b) {
        return null;
    }

    public Integer subtract(Integer a, Integer b) {
        return null;
    }

    public Integer multiply(Integer a, Integer b) {
        return null;
    }

    public Integer divide(Integer a, Integer b) {
        return null;
    }
}
