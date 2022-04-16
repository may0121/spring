package com.bjpowernode.test;


import com.bjpowernode.s01.SomeService;



import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author may
 * @date 2022/4/13 17:21
 */
public class MyTest {
//    @Test
//    public void test(){
//        ApplicationContext ac = new ClassPathXmlApplicationContext("s01/applicationContext.xml");
//        SomeService someService = (SomeService) ac.getBean("someService");
//        System.out.println(someService.getClass());
//        someService.show();
//
//    }
    @Test
    public  void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s01/applicationContext.xml");
        SomeService someServiceImp = (SomeService) ac.getBean("someServiceImpl");
        someServiceImp.show();
    }


}
