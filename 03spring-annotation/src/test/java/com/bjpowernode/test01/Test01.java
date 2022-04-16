package com.bjpowernode.test01;

import com.bjpowernode.s01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author may
 * @date 2022/4/12 11:03
 */
public class Test01 {
    @Test
    public void Test (){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s01/applicationContext.xml");
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
    }
}
