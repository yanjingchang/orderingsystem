package com.ordering;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: AccountApplication
 * @Description:
 * @Author: 颜景昌
 * @Date: 2021/7/13 - 15:40
 * @Vesion: 1.0
 */
@SpringBootApplication
@MapperScan("com.ordering.repository")
public class AccountApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class,args);
    }
}
