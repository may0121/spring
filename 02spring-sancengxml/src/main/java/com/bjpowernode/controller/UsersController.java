package com.bjpowernode.controller;

import com.bjpowernode.entity.Users;
import com.bjpowernode.service.UsersService;

/**
 * @author may
 * @date 2022/4/11 14:40
 */
public class UsersController {

//    在控制层里面处理业务 要创建 业务对象
    private UsersService usersService;// = new UsersServiceImpl();

    //在spring中注入对象要提供set方法


    public void setUsersService(UsersService usersService) {
        this.usersService = usersService;
    }

    public int addUsers(Users users){
        return usersService.addUsers(users);
    }

}
