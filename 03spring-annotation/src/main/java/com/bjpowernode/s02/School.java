package com.bjpowernode.s02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author may
 * @date 2022/4/12 13:27
 */
@Component("qinghua")//按名称注入，这里的名字跟后面的 @Qualifier("qinghua")一样
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
