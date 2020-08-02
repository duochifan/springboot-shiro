package com.yjh.entity;

import lombok.Data;

/**
 * @Author mua
 * @Date 2020/8/2 14:18
 */

@Data
public class Account {

    private Integer id;

    private String username;

    private String password;

    private String perms;

    private String role;
}
