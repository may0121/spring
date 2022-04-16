package com.bjpowernode.s04;

import org.springframework.stereotype.Service;

/**
 * @author may
 * @date 2022/4/14 16:54
 */
@Service
public class SomeServiceImpl implements SomeService {
    @Override
    public String doSome(String name, int age) {
        System.out.println("主要业务方法。。。。");
//        System.out.println(1/0);
        return "abcd";
    }
}
