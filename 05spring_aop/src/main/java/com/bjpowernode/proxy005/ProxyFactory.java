package com.bjpowernode.proxy005;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author may
 * @date 2022/4/13 13:05
 */
public class ProxyFactory {
    public static Object getAgent(Service target,AOP aop){
        return Proxy.newProxyInstance(
                //        类加载
                target.getClass().getClassLoader(),
//                目标对象实现的所有接口
                target.getClass().getInterfaces(),
//                代理功能实现
                new InvocationHandler() {
                    @Override
                    public Object invoke(
        //                        生成的代理对象
                            Object proxy,
                    //正在被调用的目标方法
                            Method method,
                     //目标参数的方法
                            Object[] args) throws Throwable {
                        Object obj=null;
//                  切面
                        try {
                            aop.before();
//                        业务
                           obj=   method.invoke(target,args);
//                        切面
                            aop.after();
                        } catch (Exception exception) {
                            aop.excepton();
                        }
//                        切面

                    return obj;


                    }
                }
        );


    }

}
