package com.bjpowernode.test;

import com.bjpowernode.proxy005.*;
import org.junit.Test;

/**
 * @author may
 * @date 2022/4/13 13:24
 */
public class MyTest05 {
    @Test
    public void test(){
        Service agent = (Service) ProxyFactory.getAgent(new BookServiceImpl(),new TransAop());
        Service agent1 = (Service) ProxyFactory.getAgent(agent,new LogAop());
        String show = agent1.show(15);
        System.out.println(show);
    }
}
