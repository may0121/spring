package com.bjpowernode.proxy005;

/**
 * @author may
 * @date 2022/4/13 11:04
 */
public class TransAop implements AOP {
    @Override
    public void before() {
        System.out.println("事务开启。。。");
    }

    @Override
    public void after() {
        System.out.println("事务提交。。。");
    }

    @Override
    public void excepton() {
        System.out.println("事务回滚。。。");
    }
}
