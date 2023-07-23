package com.southwind.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientcontroller")
public class ConfigClientController {
    @Value("${server.port}")
    private String port;
    @Value("${spring.application.name}")
    private  String name;

    @GetMapping("/index")
    public  String index(){
        //测试读取配置文件信息
        return this.port+"---->"+this.name;
    }
}
