package com.bjpowernode.test;

import com.bjpowernode.s02.SomeService;
import com.bjpowernode.s02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author may
 * @date 2022/4/14 16:00
 */
public class MyTest02 {
    @Test
    public void myTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        SomeService someServiceImpl = (SomeService) ac.getBean("someServiceImpl");
        String s = someServiceImpl.dosome("张三", 22);
        System.out.println(s);

    }
    @Test
    public void myTest01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        SomeService someServiceImpl = (SomeService) ac.getBean("someServiceImpl");
        Student s = someServiceImpl.change();
        System.out.println(s);

    }
}
