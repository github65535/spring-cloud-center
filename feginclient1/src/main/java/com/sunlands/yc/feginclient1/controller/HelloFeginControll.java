package com.sunlands.yc.feginclient1.controller;

import com.sunlands.yc.feginclient1.service.HelloFeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloFeginControll {
    @Autowired
    private HelloFeginService helloFeginService;

    @GetMapping("/api-a/hi")
    public Object getHi(){
        return helloFeginService.getHi();
    }
}
