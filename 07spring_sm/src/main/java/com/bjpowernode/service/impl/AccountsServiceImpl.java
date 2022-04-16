package com.bjpowernode.service.impl;

import com.bjpowernode.mapper.AccountsMapper;
import com.bjpowernode.pojo.Accounts;
import com.bjpowernode.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author may
 * @date 2022/4/15 13:10
 */
@Service
public class AccountsServiceImpl implements AccountsService {
//    数据访问层对象
    @Autowired
AccountsMapper accountMapper;
    @Override
    public int save(Accounts accounts) {
        int num =0;
        num = accountMapper.save(accounts);
        System.out.println("增加账户成功！"+num);
//        手动抛出异常
        System.out.println(1/0);
        return num;
    }
}
