package com.sunlands.yc.consumerclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/hi")
    public Object hello(){


        return "hello consumer~";
    }

    /**
     * Rest服务端使用RestTemplate发起http请求,然后得到数据返回给前端
     * @return
     */
    @GetMapping(value = "/gethi")
    public Object getUser(){
        /**
         * 根据服务名称访问提供同一类型服务的接口
         */
        return restTemplate.getForObject("http://eureka-client/hi",String.class);
    }
}
