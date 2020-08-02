package com.yjh.service;

import com.yjh.entity.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author mua
 * @Date 2020/8/2 14:54
 */
@SpringBootTest
class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    void getAccountByUserName() {
        Account ls = accountService.getAccountByUserName("ls");
        System.out.println(ls);
    }
}