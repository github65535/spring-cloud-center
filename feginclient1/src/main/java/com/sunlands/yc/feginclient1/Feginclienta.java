package com.sunlands.yc.feginclient1;

import com.sunlands.yc.feginclient1.config.WxMessageConverter;
import feign.codec.Decoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class Feginclienta {

  public static void main(String[] args) {
    SpringApplication.run(Feginclienta.class, args);
  }

  //	注入新的Decoder Feign将自动 替换
  // 解决微信返回参数为[text/plain] 无法转化为json
  @Bean
  public Decoder feignDecoder() {
    WxMessageConverter wxConverter = new WxMessageConverter();
    ObjectFactory<HttpMessageConverters> objectFactory =
        () -> new HttpMessageConverters(wxConverter);
    return new SpringDecoder(objectFactory);
  }
}
