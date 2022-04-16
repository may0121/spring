package com.bjpowernode.test01;

import com.bjpowernode.s02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author may
 * @date 2022/4/12 13:32
 */
public class MyTest02 {
    @Test
    public void annotation(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        //默认注解生成的对象是 类名 按照驼峰命名原则
        Student student = (Student) ac.getBean("lisi");
        System.out.println(student);
    }
}
