package com.bjpowernode.dao.impl;

import com.bjpowernode.dao.UsersMapper;
import com.bjpowernode.entity.Users;

/**
 * @author may
 * @date 2022/4/11 14:35
 */
public class UserMapperImpl implements UsersMapper {


    @Override
    public int addUsers(Users users) {
        System.out.println(users.getUname()+"创建了");
        return 1;
    }
}
