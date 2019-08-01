package com.sunlands.yc.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api-a/hi")
    public Object hello(){
//        return "hello ,this is demo client~";
        return "{\"key\":\"hi2\"}";
    }
}
