package com.southwind.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.southwind.entity.Student;
import com.southwind.feign.IFeignService;

@RestController
@RequestMapping("/feign")
public class FeignHandler {

    @Autowired
    private IFeignService feignservice;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignservice.findAll();
    }

    @GetMapping("/index")
    public String index() {
        return feignservice.index();
    }

}
