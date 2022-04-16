package com.bjpowernode.s01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author may
 * @date 2022/4/12 10:55
 */

//注解生成对象默认是类名，可以修改对象名@Component(“修改的对象名”)
@Component
public class Student {
    @Value("张三")
    private String  name;
    @Value("22")
    private int age;

    public Student() {
        System.out.println("studenr的 无参构造方法");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
