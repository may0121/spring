package com.bjpowernode.s02;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Myaspect {
    /**1.访问权限是public
     * 2.返回值是void
     * 3.方法有没有参数取决于目标方法有没有返回值
     * 4.使用@AfterReturning 注解表示后置通知
     * 参数：
     *      value：指定切入点表达式
     *      returning 指定目标方法的返回值 名称与切面方法的参数名称一致

     */
    @AfterReturning(value = "execution(* com.bjpowernode.s02.*.*(..))",returning = "obj")
    public void myAfterReturning (Object obj){
        System.out.println("后置通知功能实现。。。。");
        if (obj!=null){
            if (obj instanceof String ){
                obj = obj.toString().toUpperCase();
                System.out.println("将返回值改为大写："+obj);
            }
            if (obj instanceof Student){
                Student student = (Student) obj;
                student.setName("李四");

                System.out.println("学生的姓名是："+student);
            }
        }
    }
}
