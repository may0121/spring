package com.bjpowernode.test;

import com.bjpowernode.s03.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author may
 * @date 2022/4/14 17:08
 */
public class MyTest03 {
    @Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s03/applicationContext.xml");
        SomeService someServiceImpl = (SomeService) ac.getBean("someServiceImpl");
        String s = someServiceImpl.doSome("张三", 34);
        System.out.println("主业务方法中的返回值是："+s);
    }
}
