package com.ordering.repository;

import com.ordering.entity.Type;

import java.util.List;

/**
 * @ClassName: TypeRepository
 * @Description:
 * @Author: 颜景昌
 * @Date: 2021/7/14 - 10:52
 * @Vesion: 1.0
 */
public interface TypeRepository {
    public List<Type> findAll();
}
