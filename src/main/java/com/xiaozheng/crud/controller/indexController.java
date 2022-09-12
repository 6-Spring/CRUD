package com.xiaozheng.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 郑元龙
 * @description: TODO
 * @date 2022年09月12日 11:43
 */
@Controller
public class indexController {
    @RequestMapping("hello")
    public String hello(){
        return "crud";
    }
}

