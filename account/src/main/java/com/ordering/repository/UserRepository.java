package com.ordering.repository;

import com.ordering.entity.User;

/**
 * @ClassName: UserRepository
 * @Description:
 * @Author: 颜景昌
 * @Date: 2021/7/13 - 15:56
 * @Vesion: 1.0
 */
public interface UserRepository {
    public User login(String username,String password);
}
