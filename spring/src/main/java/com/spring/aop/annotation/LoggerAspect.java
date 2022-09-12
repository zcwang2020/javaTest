package com.spring.aop.annotation;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author wzc
 * @Date 2022/9/12
 */
@Component
@Aspect
public class LoggerAspect {

    /**
     * 抽取切入点
     */
    @Pointcut("execution(* com.spring.aop.*.*(..))")
    public void getPointCut() {}

    /**
     * 前置通知
     * 
     * @param joinPoint
     */
    @Before("getPointCut()")
    public void beforeAdviceMethod(JoinPoint joinPoint) {
        System.out.println(
            "Logger-->前置通知，方法：" + joinPoint.getSignature().getName() + "参数：" + Arrays.toString(joinPoint.getArgs()));
    }

    /**
     * 后置通知
     * 
     * @param joinPoint
     */
    @After("getPointCut()")
    public void afterAdviceMethod(JoinPoint joinPoint) {
        System.out.println("Logger-->后置通知，方法：" + joinPoint.getSignature().getName());
    }

    /**
     * 返回通知
     * 
     * @param joinPoint
     * @param result
     */
    @AfterReturning(value = "getPointCut()", returning = "result")
    public void afterReturningMethod(JoinPoint joinPoint, Object result) {
        System.out.println("Logger-->返回通知，方法：" + joinPoint.getSignature().getName() + "结果：" + result);
    }

    /**
     * @param joinPoint
     */
    @AfterThrowing(value = "getPointCut()", throwing = "ex")
    public void afterThrowingMethod(JoinPoint joinPoint, Throwable ex) {
        System.out.println("Logger-->异常通知，方法：" + joinPoint.getSignature().getName() + "异常：" + ex);
    }

    @Around("getPointCut()")
    public Object beforeAdviceMethod(ProceedingJoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());

        System.out.println("环绕通知-->前置通知，方法：" + methodName + "参数：" + args);
        //目标对象（连接点）方法的执行
        Object result = null;
        System.out.println("环绕通知-->返回通知");
        try {
            result = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("环绕通知-->异常通知");
        } finally {
            System.out.println("环绕通知-->后置通知");
        }

        return result;
    }
}
