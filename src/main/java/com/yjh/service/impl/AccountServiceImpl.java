package com.yjh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yjh.entity.Account;
import com.yjh.mapper.AccountMapper;
import com.yjh.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author mua
 * @Date 2020/8/2 14:49
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Account getAccountByUserName(String username) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("username",username);
        return accountMapper.selectOne(wrapper);
    }
}
