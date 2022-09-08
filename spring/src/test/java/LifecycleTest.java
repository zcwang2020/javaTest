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
     * 3.后置处理器的postProcessBeforeInitialization方法
     * 4.初始化，需要通过bean的init-method属性指定初始化的方法
     * 5.后置处理器的postProcessAfterInitialization方法
     * 6.IOC容器关闭时销毁,需要通过bean的destroy-method属性指定销毁的方法
     */

    @Test
    public void lifecycleTest() {
        ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        User user = ioc.getBean("user", User.class);
        System.out.println(user);
        ioc.close();
    }
}