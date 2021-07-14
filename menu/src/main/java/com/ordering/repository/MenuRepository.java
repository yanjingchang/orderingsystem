package com.ordering.repository;

import com.ordering.entity.Menu;

import java.util.List;

/**
 * @ClassName: MenuRepository
 * @Description:
 * @Author: 颜景昌
 * @Date: 2021/7/14 - 10:43
 * @Vesion: 1.0
 */
public interface MenuRepository {
    public List<Menu> findAll(int index,int limit);
    public int count();
    public void save(Menu menu);
    public Menu findById(long id);
    public void update(Menu menu);
    public void deleteById(long id);
}
