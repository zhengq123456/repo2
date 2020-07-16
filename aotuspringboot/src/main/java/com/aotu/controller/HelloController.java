package com.aotu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {

    @Autowired
    public DataSource dataSource;

    @Value("${itcast.url}")
    public String itcastUrl;

    @Value("${itheima.url}")
    public String itheimaUrl;

    @GetMapping("hello")
    public String hello(){
        System.out.println(dataSource);
        System.out.println(itcastUrl);
        System.out.println(itheimaUrl);
        return "hello springboot";
    }
}
