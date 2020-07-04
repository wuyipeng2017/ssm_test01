package com.itheima.dao;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * @author wuyipeng
 * @version 1.0
 * @date 2020/7/3 20:23
 */
public interface ItemsDao {
    int save(Items items);

    List<Items> list();
}
