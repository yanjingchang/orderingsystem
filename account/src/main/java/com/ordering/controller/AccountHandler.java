package com.ordering.controller;

import com.ordering.entity.Account;
import com.ordering.repository.AdminRepository;
import com.ordering.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: AccountHandler
 * @Description:
 * @Author: 颜景昌
 * @Date: 2021/7/13 - 16:22
 * @Vesion: 1.0
 */
@RestController
@RequestMapping("/account")
public class AccountHandler {
    @Resource
    private UserRepository userRepository;
    @Resource
    private AdminRepository adminRepository;

    @GetMapping("/login/{username}/{password}/{type}")
    public Account login(@PathVariable("username") String username, @PathVariable("password") String password,@PathVariable("type") String type){
        Account account = null;
        switch (type){
            case "user":
                account = userRepository.login(username,password);
                break;
            case "admin":
                account = adminRepository.login(username,password);
                break;
        }
        return account;
    }
}
