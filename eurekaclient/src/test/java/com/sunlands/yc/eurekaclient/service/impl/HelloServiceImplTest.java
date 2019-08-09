package com.sunlands.yc.eurekaclient.service.impl;

import com.sunlands.yc.eurekaclient.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest()
@ActiveProfiles("local")
public class HelloServiceImplTest {

    @Autowired
    private HelloService helloService;

  @Test
  public void getCacheTest() {
      String warnTimeFlag = "flag1";
      String warnTime1 = helloService.getWarnTime(warnTimeFlag);
    System.out.println("result 1  : "+warnTime1);
      String warnTime2 = helloService.getWarnTime(warnTimeFlag);
    System.out.println("result 2 : "+warnTime2);

      try {
          new Thread().sleep(3000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
      helloService.updateWarnTime(warnTimeFlag);
      String warnTime4 = helloService.getWarnTime(warnTimeFlag);
    System.out.println("result 4 : "+warnTime4);
      String warnTime5 = helloService.getWarnTime(warnTimeFlag);
    System.out.println("result 5 : "+warnTime5);

      String warnTime6 = helloService.getWarnTime("flag2");
      System.out.println("result 6 : "+warnTime6);
  }
}