package com.ordering.entity;

import lombok.Data;


/**
 * @ClassName: Menu
 * @Description:对应数据库菜单表：t_menu
 * @Author: 颜景昌
 * @Date: 2021/7/14 - 10:36
 * @Vesion: 1.0
 */
@Data
public class Menu {
    private long id;
    private String name;
    private double price;
    private String flavor;
    private Type type;
}
