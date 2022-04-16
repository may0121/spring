package com.bjpowernode;

import com.bjpowernode.controller.UsersController;
import com.bjpowernode.entity.Users;
import org.junit.Test;

/**
 * @author may
 * @date 2022/4/11 14:48
 */
public class MyTest {
    @Test
    public void addUsers(){
        //创建控制层对象掉方法
        UsersController usersController = new UsersController();
        int nums = usersController.addUsers(new Users(1, "张三", 18));
        System.out.println(nums);
    }
}
