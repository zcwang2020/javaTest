/**
 * @(#)LifecycleTest.java, 2022/9/8.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.pojo.User;

/**
 * @Author zcwang
 * @Date 2022/9/8
 */
public class LifecycleTest {

    /**
     * 1.实例化
     * 2.依赖注入
     * 3.初始化
     * 4.销毁
     */

    @Test
    public void lifecycleTest() {
        ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        User user = ioc.getBean("user", User.class);
        System.out.println(user);
        ioc.close();
    }
}