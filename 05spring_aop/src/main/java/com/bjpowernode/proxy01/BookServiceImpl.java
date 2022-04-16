package com.bjpowernode.proxy01;

/**
 * @author may
 * @date 2022/4/12 19:11
 */
public class BookServiceImpl {
    public void buy(){
        try {
            System.out.println("事务开启。。。。");
            System.out.println("图书购买业务功能实现。。。。。");
            System.out.println("事务提交。。。。");
        } catch (Exception exception) {
            System.out.println("事务回滚。。。");
        }

    }
}
