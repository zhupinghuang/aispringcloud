package com.southwind.feign.impl;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.southwind.entity.Student;
import com.southwind.feign.IFeignService;

@Component
public class FeignServiceImpl implements IFeignService{

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中。。。";
    }

}