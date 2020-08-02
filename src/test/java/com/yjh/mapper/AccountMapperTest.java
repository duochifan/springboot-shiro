package com.yjh.mapper;

import com.yjh.entity.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author mua
 * @Date 2020/8/2 14:37
 */
@SpringBootTest
class AccountMapperTest {


    @Autowired
    private AccountMapper accountMapper;

    @Test
    void test(){
        List<Account> accounts = accountMapper.selectList(null);
        System.out.println(accounts);
    }
}