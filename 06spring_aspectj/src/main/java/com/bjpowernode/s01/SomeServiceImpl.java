package com.bjpowernode.s01;

import org.springframework.stereotype.Service;

/**
 * @author may
 * @date 2022/4/13 15:58
 */

//业务实现类
    @Service
public class SomeServiceImpl implements SomeService {
    @Override
    public String doSome(String name, int age) {
        System.out.println("dosome的业务实现类。。。");
        return "abcd";
    }

    @Override
    public void show() {
        System.out.println("show方法的业务实现类。。。");
    }
}
