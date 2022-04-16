package com.bjpowernode.test;


import com.bjpowernode.proxy03.*;
import org.junit.Test;

/**
 * @author may
 * @date 2022/4/12 19:33
 */
public class MyTest {
    @Test
    public void test01(){
        Service service = new Agent(new BookServiceImpl(),new TransAop());
        Service service1 = new Agent(service,new LogAop());
        service1.buy();
    }
}
