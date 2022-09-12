package com.spring.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author wzc
 * @Date 2022/9/12
 */
@Component
@Aspect
@Order(1)
public class CheckAspect {
    /**
     * 前置通知
     *
     * @param joinPoint
     */
    @Before("com.spring.aop.annotation.LoggerAspect.getPointCut()")
    public void beforeAdviceMethod(JoinPoint joinPoint) {
        System.out.println(
                "Check-->前置通知，方法：" + joinPoint.getSignature().getName() + "参数：" + Arrays.toString(joinPoint.getArgs()));
    }
}
