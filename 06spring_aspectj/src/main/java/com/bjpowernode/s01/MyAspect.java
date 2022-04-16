package com.bjpowernode.s01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author may
 * @date 2022/4/13 16:00
 */

//@Aspect //交给aspectj框架去识别切面类
    @Component
public class MyAspect {
    /**
     * 所有切面的功能都是切面方法实现的
     * 可以将各种切面都在此类中进行开发
     *
     *
     * 前置通知的切面方法的规范
     * 1.访问权限是public
     * 2.方法的返回值是void
     * 3.方法名称自定义
     * 4.方法没有参数，如果有也只能是joinPoint类型
     * 5.必须使用@Before注解来声明切入的时机是前切入功能和切入点
     * 参数value  指定切入点表达式
     *
     * 业务方法
     *  String doSome(String name ,int age);
     */
    @Before(value = "execution( * com.bjpowernode.s01.*.*(..))")
    public  void MyBefore(JoinPoint joinPoint){

        System.out.println("切面方法中的前置通知功能实现。。。");
//        获取参数
        System.out.println(Arrays.toString(joinPoint.getArgs()));
//        获取标签
        System.out.println(joinPoint.getSignature());

    }
}
