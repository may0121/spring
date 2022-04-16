package com.bjpowernode.s02;

import org.springframework.stereotype.Service;

/**
 * @author may
 * @date 2022/4/14 15:52
 */
@Service
public class SomeServiceImpl implements SomeService {

    @Override
    public String dosome(String name, int age) {
        System.out.println("切面方法实施了。。。。。");
        return "abcd";
    }

    @Override
    public Student change() {
        return new Student("张三");
    }
}
