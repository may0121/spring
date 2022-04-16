package com.bjpowernode.proxy02;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/**
 * @author may
 * @date 2022/4/12 19:26
 */
public class SubBookServiceIMpl extends BookServiceImpl {
    @Override
    public void buy(){
        try {
            //事务切面
            System.out.println("事务开启。。。。");
            //主业务开启
            super.buy();
            //业务切面
            System.out.println("事务开启。。。。");
        } catch (Exception exception) {
            System.out.println("事务回滚。。。。");
        }
    }

}
