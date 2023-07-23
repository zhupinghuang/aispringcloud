package com.southwind.feign;

import java.util.Collection;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.southwind.entity.Student;
import com.southwind.feign.impl.FeignServiceImpl;

@FeignClient(value = "provider",fallback = FeignServiceImpl.class)
public interface IFeignService {

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}