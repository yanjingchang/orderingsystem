package com.ordering.entity;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: MenuVO
 * @Description:为layUI提供封装类
 * @Author: 颜景昌
 * @Date: 2021/7/14 - 10:40
 * @Vesion: 1.0
 */
@Data
public class MenuVO {
    private int code;
    private String msg;
    private int count;
    private List<Menu> data;

}
