package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author wuyipeng
 * @version 1.0
 * @date 2020/7/4 10:00
 */
@Controller
@RequestMapping("items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    @RequestMapping("list")
    public String list(Model model) {
        List<Items> itemsList = itemsService.list();
        model.addAttribute("items", itemsList);
        return "items";
    }

    @RequestMapping("list2")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView();
        List<Items> itemsList = itemsService.list();
        modelAndView.addObject("items", itemsList);
        modelAndView.setViewName("items");
        return modelAndView;
    }

    @RequestMapping("save")
    public String save(Items items) {
        itemsService.save(items);
        return "redirect:/items/list.do";
    }
}
