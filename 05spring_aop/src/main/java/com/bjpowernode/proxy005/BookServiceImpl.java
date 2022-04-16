package com.bjpowernode.proxy005;

/**
 * @author may
 * @date 2022/4/12 19:56
 */
public class BookServiceImpl implements Service {
    @Override
    public void buy() {
        System.out.println("图书购买业务功能实现。。。。。");
    }

    @Override
    public String show(int age) {
        System.out.println("这是show方法被调用。。"+age);
        return "abcd";
    }
}
