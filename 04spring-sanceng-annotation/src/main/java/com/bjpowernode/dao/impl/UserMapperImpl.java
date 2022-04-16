package com.bjpowernode.dao.impl;

import com.bjpowernode.dao.UsersMapper;
import com.bjpowernode.entity.Users;
import org.springframework.stereotype.Repository;

/**
 * @author may
 * @date 2022/4/11 14:35
 */

@Repository
public class UserMapperImpl implements UsersMapper {


    @Override
    public int addUsers(Users users) {
        System.out.println(users.getUname()+"创建了");
        return 1;
    }
}
