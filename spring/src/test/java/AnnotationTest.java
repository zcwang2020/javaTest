/**
 * @(#)AnnotationTest.java, 2022/9/9.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.controller.UserController;

/**
 * @Author zcwang
 * @Date 2022/9/9
 */
public class AnnotationTest {

    @Test
    public void testAnnotation() {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController bean = ioc.getBean(UserController.class);
        bean.saveUser();
    }
}