package com.ordering.repository;

import com.ordering.entity.Admin;

/**
 * @ClassName: AdiminRepository
 * @Description:
 * @Author: 颜景昌
 * @Date: 2021/7/13 - 15:57
 * @Vesion: 1.0
 */
public interface AdminRepository {
    public Admin login(String username,String password);
}
