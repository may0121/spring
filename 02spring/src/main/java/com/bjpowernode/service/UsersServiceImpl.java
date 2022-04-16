package com.bjpowernode.service;

import com.bjpowernode.dao.UsersMapper;
import com.bjpowernode.dao.impl.UserMapperImpl;
import com.bjpowernode.entity.Users;
import com.bjpowernode.service.UsersService;

/**
 * @author may
 * @date 2022/4/11 14:37
 */
public class UsersServiceImpl implements UsersService {
    //在业务层里面调用 数据访问层一定要创建对象
    private UsersMapper usersMapper = new UserMapperImpl();

    @Override
    public int addUsers(Users users) {
        return usersMapper.addUsers(users);
    }
}
