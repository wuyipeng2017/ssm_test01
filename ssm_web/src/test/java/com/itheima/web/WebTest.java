package com.itheima.web;

import com.itheima.controller.ItemsController;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author wuyipeng
 * @version 1.0
 * @date 2020/7/4 11:02
 */
public class WebTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mvc.xml");
        ItemsController itemsController = (ItemsController) applicationContext.getBean("itemsController");
        ModelAndView list = itemsController.list();
        System.out.println(list);
    }
}
