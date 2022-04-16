package com.bjpowernode;

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
//        启动容器创建对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("total.xml");
        //取出对象
        UsersController usersController = (UsersController) ac.getBean("usersController");
        int users = usersController.addUsers(new Users(3, "张三", 22));
        System.out.println(users);
    }
}
