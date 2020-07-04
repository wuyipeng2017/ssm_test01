package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wuyipeng
 * @version 1.0
 * @date 2020/7/4 10:14
 */
@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;
    @Override
    public List<Items> list() {
        return itemsDao.list();
    }

    @Override
    public int save(Items items) {
        int account = itemsDao.save(items);
        System.out.println("account: " + account);
        return account;
    }
}
