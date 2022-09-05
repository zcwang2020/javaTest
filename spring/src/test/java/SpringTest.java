/**
 * @(#)SpringTest.java, 2022/9/5.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.pojo.Clazz;
import com.spring.pojo.User;

/**
 * @Author zcwang
 * @Date 2022/9/5
 */
public class SpringTest {

    @Test
    public void getBeanByName() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 根据bean name获取
        User user = (User) ioc.getBean("user");
        System.out.println(user);
    }

    /**
     * org.springframework.beans.factory.NoUniqueBeanDefinitionException:
     * No qualifying bean of type 'com.spring.pojo.User' available: expected single matching bean but found 2: user,user2
     * 同一个类有两个bean，Id，将类设置为单例
     */
    @Test
    public void getBeanByClass() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = ioc.getBean(User.class);
        System.out.println(user);
    }

    /**
     * org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'User' available,没有这个类
     */
    @Test
    public void getBeanByNameAndClass() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        // org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'User' available,没有这个类
        // User user = ioc.getBean("User", User.class);
        User user = ioc.getBean("user", User.class);
        System.out.println(user);
        User user2 = ioc.getBean("user2", User.class);
        System.out.println(user2);
    }

    @Test
    public void testDI() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        // list对象注入
        Clazz clazz1 = ioc.getBean("clazz1", Clazz.class);
        System.out.println("clazz1 = " + clazz1);
        // 使用util:list标签,list对象注入
        Clazz clazz2 = ioc.getBean("clazz2", Clazz.class);
        System.out.println("clazz2 = " + clazz2);
        // Map对象注入
        User user = ioc.getBean("user3", User.class);
        System.out.println("user3 = " + user);
        // 使用util:map标签,Map对象注入
        User user3 = ioc.getBean("user4", User.class);
        System.out.println("user4 = " + user3);

    }
}