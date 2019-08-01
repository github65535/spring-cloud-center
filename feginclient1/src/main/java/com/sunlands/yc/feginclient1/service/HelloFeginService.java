package com.sunlands.yc.feginclient1.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("EUREKA-CLIENT")
public interface HelloFeginService {

//    @RequestMapping()
    @GetMapping("/api-a/hi")
    Object getHi();
}
