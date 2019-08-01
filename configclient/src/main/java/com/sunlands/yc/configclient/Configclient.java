package com.sunlands.yc.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableConfigServer
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
@RestController
public class Configclient {

  public static void main(String[] args) {
    SpringApplication.run(Configclient.class, args);
  }

  @RefreshScope
  @RestController
  class MessageRestController {

    @Value("${foo:Hello default}")
    private String message;

    @RequestMapping("/hi")
    String getMessage() {
      return this.message;
    }
  }

}
