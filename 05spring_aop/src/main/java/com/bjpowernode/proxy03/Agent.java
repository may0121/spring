package com.bjpowernode.proxy03;

import com.bjpowernode.proxy04.AOP;

/**
 * @author may
 * @date 2022/4/12 19:58
 */
public class Agent extends BookServiceImpl{
//设计成员变量的类型为接口，可以灵活切换对象目标
    public Service target;
    AOP aop;
//用构造方法传入目标对象


    public Agent(Service target, AOP aop) {
        this.target = target;
        this.aop = aop;
    }

    @Override
    public void buy(){
        try {
//切面功能
            aop.before();
//        主业务
            target.buy();
//        事务关闭
          aop.after();
        } catch (Exception exception) {
           aop.excepton();
        }
    }
}
