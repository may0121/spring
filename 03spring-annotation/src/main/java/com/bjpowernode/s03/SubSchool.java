package com.bjpowernode.s03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author may
 * @date 2022/4/12 14:14
 */
@Component("school002")
public class SubSchool extends School {
    @Value("重庆工商大学")
    private String name ;
    @Value("重庆市南岸区")
    private String adress;

    public SubSchool() {
        System.out.println("子类school 的无参构造方法");
    }

    @Override
    public String toString() {
        return "SubSchool{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
