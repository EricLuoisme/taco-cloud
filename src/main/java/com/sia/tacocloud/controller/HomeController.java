package com.sia.tacocloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")    // 控制器注解
    public String home() { // 处理对跟路径"/"的请求
        return "home";
        // 返回视图名
    }
}
