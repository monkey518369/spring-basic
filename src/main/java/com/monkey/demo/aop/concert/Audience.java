package com.monkey.demo.aop.concert;


import com.monkey.demo.aop.concert.plus.Action;
import com.monkey.demo.aop.concert.plus.Sing;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @program: springbasic
 * @description:
 * @author: monkey
 * @create: 2018-11-12 23:25
 **/
@Component
@Aspect
public class Audience {


    /**
     * 使用@DeclareParents注解来为已经有的类增加新的功能
     * value表示需要添加新功能的类，defaultImpl表示为了引入功能提供的实现类。
     * +号表示performance及其子类都会适用。
     *
     */
    @DeclareParents(value = "com.monkey.demo.aop.concert.Performance+",defaultImpl = Sing.class)
    public static Action action;


    @Pointcut("execution(* com.monkey.demo.aop.concert.Performance.perform(..))")
    public void performance(){}

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around before");
        System.out.println("jp.getArgs:"+joinPoint.getArgs());
        Object[] objects = joinPoint.getArgs();
        objects[0] = 16;
        joinPoint.proceed(objects);
        System.out.println("jp.kind:"+joinPoint.getKind());
        System.out.println("jp.longstring:"+joinPoint.toLongString());
        System.out.println("jp.shortstring:"+joinPoint.toShortString());
        System.out.println("jp.gettarget:"+joinPoint.getTarget());
        System.out.println("jp.getthis:"+joinPoint.getThis());
        System.out.println("jp.getsourcelocation:"+joinPoint.getSourceLocation());
        System.out.println("jp.gestaticpart:"+joinPoint.getStaticPart());
        System.out.println("jp.getSignature:"+joinPoint.getSignature());
        System.out.println("around after");
    }


    @Before("performance()")
    public void silenceCellPhone(JoinPoint joinPoint) throws Throwable {
        System.out.println("please shut down you cellphone ");
    }

    @After("performance()")
    public void applause(JoinPoint joinPoint){
        System.out.println("CLAP CLAP CLAP");
    }

    @AfterThrowing("performance()")
    public void demandRefund(JoinPoint joinPoint){
        System.out.println("Demanding a refund");
    }


}
