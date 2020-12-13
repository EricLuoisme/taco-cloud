package com.sia.tacocloud.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author lykis
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() { // 处理对跟路径"/"的请求
        return "home";
        // 返回视图名
    }
}
