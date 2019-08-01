package com.sunlands.yc.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Eurekaclient2 {

    public static void main(String[] args) {
        SpringApplication.run(Eurekaclient2.class, args);
    }

}
