package com.bjpowernode.test;

import com.bjpowernode.pojo.Accounts;
import com.bjpowernode.pojo.Users;
import com.bjpowernode.service.AccountsService;
import com.bjpowernode.service.UsersService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author may
 * @date 2022/4/15 12:49
 */
public class MyTest {
    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
//        用接口接
        UsersService usersService = (UsersService) ac.getBean("usersServiceImpl");
        usersService.insert(new Users(001, "张三", "123"));
//        不需要手动提交 spring自动提交

    }

    @Test
    public void testAccount() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
//        用接口接
        AccountsService accountService = (AccountsService) ac.getBean("accountsServiceImpl");
       accountService.save(new Accounts(002, "李四1", "账户安全1"));

    }

    @Test
    public void testTrans() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
//        用接口接
        UsersService usersService = (UsersService) ac.getBean("usersServiceImpl");
        usersService.insert(new Users(001, "张三", "123"));

    }
}
