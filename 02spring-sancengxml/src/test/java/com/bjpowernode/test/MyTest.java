package com.bjpowernode.test;

import com.bjpowernode.controller.UsersController;
import com.bjpowernode.entity.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author may
 * @date 2022/4/11 14:48
 */
public class MyTest {
    @Test
    public void addUsers(){
        //创建容器并启用
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("total.xml");
//        取出对象
        UsersController users = (UsersController) applicationContext.getBean("uController");
//        测试
        int nums = users.addUsers(new Users(2,"李四",20));
        System.out.println(nums);
    }
}
