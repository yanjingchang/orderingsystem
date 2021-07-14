package com.ordering;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: MenuApplication
 * @Description:
 * @Author: 颜景昌
 * @Date: 2021/7/14 - 10:15
 * @Vesion: 1.0
 */
@SpringBootApplication
@MapperScan("com.ordering.repository")
public class MenuApplication {
    public static void main(String[] args) {
        SpringApplication.run(MenuApplication.class,args);
    }
}
