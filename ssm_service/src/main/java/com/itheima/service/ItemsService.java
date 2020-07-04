package com.itheima.service;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * @author wuyipeng
 * @version 1.0
 * @date 2020/7/4 9:37
 */
public interface ItemsService {
    List<Items> list();

    int save(Items items);
}
