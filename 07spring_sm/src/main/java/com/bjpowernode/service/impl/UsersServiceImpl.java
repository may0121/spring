package com.bjpowernode.service.impl;

import com.bjpowernode.mapper.UsersMapper;
import com.bjpowernode.pojo.Accounts;
import com.bjpowernode.pojo.Users;
import com.bjpowernode.service.AccountsService;
import com.bjpowernode.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author may
 * @date 2022/4/15 12:31
 */
@Service
public class UsersServiceImpl implements UsersService {
//    调dao层业务
    @Autowired
    UsersMapper usersMapper;
    @Autowired
    AccountsService accountsService;
    @Override
    public int insert(Users users) {
     int num = usersMapper.insert(users);
        System.out.println("用户增加成功! num="+num);
//        调用账户的增加操作，调用账户的业务逻辑层的功能
        num = accountsService.save(new Accounts(001,"张三","事务1"));
        return num;
    }
}
