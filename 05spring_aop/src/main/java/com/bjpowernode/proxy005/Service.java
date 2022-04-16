package com.bjpowernode.proxy005;

/**
 * @author may
 * @date 2022/4/12 19:55
 */
public interface Service {
    void buy();

    default String show(int age){
        return null;
    }
}
