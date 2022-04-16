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
    private UsersMapper usersMapper ;//= new UserMapperImpl();
    //在spring配置文件当中注入对象要 提供set方法


    public void setUsersMapper(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    @Override
    public int addUsers(Users users) {
        return usersMapper.addUsers(users);
    }
}
