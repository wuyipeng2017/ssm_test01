package com.itheima.dao;

import com.itheima.pojo.Items;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

/**
 * @author wuyipeng
 * @version 1.0
 * @date 2020/7/4 10:25
 */
public class DaoTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        ItemsDao itemsDao = (ItemsDao) applicationContext.getBean("itemsDao");
        List<Items> itemsList = itemsDao.list();
        System.out.println(itemsList);

        Items items = new Items();
        items.setName("Java");
        items.setPrice(1666f);
        items.setCreatetime(new Date());
        itemsDao.save(items);
    }

}
