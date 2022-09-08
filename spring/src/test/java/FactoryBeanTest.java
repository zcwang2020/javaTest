/**
 * @(#)FactoryBeanTest.java, 2022/9/8.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.factory.UserFactoryBean;
import com.spring.pojo.User;

/**
 * @Author zcwang
 * @Date 2022/9/8
 */
public class FactoryBeanTest {

    @Test
    public void testFactoryBean() {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-factory.xml");
        User bean = ioc.getBean(User.class);
        System.out.println(bean);
    }
}