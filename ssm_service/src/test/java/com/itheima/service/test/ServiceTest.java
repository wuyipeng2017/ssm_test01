package com.itheima.service.test;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wuyipeng
 * @version 1.0
 * @date 2020/7/4 10:56
 */
public class ServiceTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-service.xml");
        ItemsService itemsService = (ItemsService) applicationContext.getBean("itemsServiceImpl");
        Items items = new Items();
        items.setName("测试事务");
        itemsService.save(items);
    }
}
