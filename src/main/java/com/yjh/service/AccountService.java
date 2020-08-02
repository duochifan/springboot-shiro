package com.yjh.service;

import com.yjh.entity.Account;

/**
 * @Author mua
 * @Date 2020/8/2 14:48
 */
public interface AccountService {

    public Account getAccountByUserName(String username);
}
