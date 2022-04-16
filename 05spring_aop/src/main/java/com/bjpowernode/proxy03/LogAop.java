package com.bjpowernode.proxy03;

import com.bjpowernode.proxy04.AOP;
import org.springframework.aop.framework.AopInfrastructureBean;

/**
 * @author may
 * @date 2022/4/13 11:10
 */
public class LogAop implements AOP {
    @Override
    public void before() {
        System.out.println("前置日志输出。。。");
    }

    @Override
    public void after() {

    }

    @Override
    public void excepton() {

    }

}
