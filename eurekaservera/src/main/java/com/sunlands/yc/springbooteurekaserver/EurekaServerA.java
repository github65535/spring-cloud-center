package com.sunlands.yc.springbooteurekaserver;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerA {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerA.class, args);
    }

}
