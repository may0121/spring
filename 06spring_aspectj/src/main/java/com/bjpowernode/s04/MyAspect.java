package com.bjpowernode.s04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author may
 * @date 2022/4/14 17:27
 */
@Aspect
@Component
public class MyAspect {
    /**
     * 最终通知方法的规范
     * 1.访问权限是public
     * 2.方法没有返回值
     * 3.方法名称自定义
     * 4.方法没有参数，有也只能是joinpoint
     * 参数：value（切入点）
     *
     *
     */
    @After(value = "mycut()")
    public void myAfter(){
        System.out.println("最终通知功能。。。");
    }
    @Before(value = "mycut()")
    public void myBefore(){
        System.out.println("前置通知功能通知功能。。。");
    }

    @AfterReturning(value = "mycut()",returning = "obj")
    public void myAfterReturning(Object obj){
        System.out.println("后置通知功能通知功能。。。");
    }

    @Around(value = "mycut()")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知中的前置通知功能通知功能。。。");
        Object obj = pjp.proceed(pjp.getArgs());
        System.out.println("环绕通知中的后置通知的功能。。。");
        return obj;
    }

    @Pointcut(value = "execution(* com.bjpowernode.s04.*.*(..))")
//    空方法
    public void mycut(){}
}
