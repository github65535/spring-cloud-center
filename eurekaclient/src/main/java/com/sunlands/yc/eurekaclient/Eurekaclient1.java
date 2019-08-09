package com.sunlands.yc.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//@EnableEurekaClient
//@EnableDiscoveryClient
@EnableCaching
@SpringBootApplication
public class Eurekaclient1 {

    public static void main(String[] args) {
        SpringApplication.run(Eurekaclient1.class, args);
    }

}
