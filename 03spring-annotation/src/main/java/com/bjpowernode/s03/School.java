package com.bjpowernode.s03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author may
 * @date 2022/4/12 13:27
 */
@Component("school001")
public class School {
    @Value("清华大学")
    private String name ;
    @Value("海淀区")
    private  String age;

    public School() {
        System.out.println("school 的无参构造");

    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
