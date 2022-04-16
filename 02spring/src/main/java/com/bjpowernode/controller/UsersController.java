package com.bjpowernode.controller;

import com.bjpowernode.entity.Users;
import com.bjpowernode.service.UsersService;
import com.bjpowernode.service.UsersServiceImpl;

/**
 * @author may
 * @date 2022/4/11 14:40
 */
public class UsersController {

//    在控制层里面处理业务 要创建 业务对象
    public UsersService usersService = new UsersServiceImpl();
    public int addUsers(Users users){
        return usersService.addUsers(users);
    }

}
