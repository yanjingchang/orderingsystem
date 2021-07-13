package com.ordering.entity;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName: Account
 * @Description:
 * @Author: 颜景昌
 * @Date: 2021/7/13 - 15:45
 * @Vesion: 1.0
 */
@Data
public class Account {
    private long id;
    private String username;
    private String passwor;
    private String nickname;
    private String gender;
    private String telephone;
    private Date registeredDate;
    private String address;


}
