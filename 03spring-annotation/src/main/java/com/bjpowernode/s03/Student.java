package com.bjpowernode.s03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author may
 * @date 2022/4/12 13:29
 */
@Component
public class Student {
    @Value("李四")
    private String name;
    @Value("18")
    private  String age;
//    引用类型用autoweird

    @Autowired
    @Qualifier("school002")
    private School school;

    public Student() {
        System.out.println("student的无参构造方法");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", school=" + school +
                '}';
    }
}
