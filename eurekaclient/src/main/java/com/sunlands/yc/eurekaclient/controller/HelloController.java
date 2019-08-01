package com.sunlands.yc.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hi")
    public Object hello(){
        return "{\"key\":\"hi1\"}";
//        return "hello ,this is eurekaclient ~";
    }

    public static int getFib3(int n){
        if(n < 0){
            return -1;
        }else if(n == 0){
            return 0;
        }else if (n == 1 || n == 2){
            return 1;
        }else{
            int[] fibAry = new int[n + 1];
            fibAry[0] = 0;
            fibAry[1] = fibAry[2] = 1;
            for(int i = 3; i <= n; i++){
                fibAry[i] = fibAry[i - 1] + fibAry[i - 2];
            }
            return fibAry[n];
        }
    }

    /**
     * 根据时间稳定递增算法（每天最多增长156）
     * (能保证 数据稳定基础上，一个参数即可控制增长幅度)
     *
     * 1. 获取小时时差
     * 2. 24小时取整 * 156
     * 3. 24小时取余 ：< 12 则  + ((1+n)*n)/2
     *                > 12 则  + 78 + ((1+n)*n)/2
     *
     * 最终数值 = (2结果 + 3结果)* n
     * @param n 倍数因子 (建议 n = 标题字符数量*0.1)
     */
  public static void main(String[] n){
    //      for(int n=0;n<25;n++){
    //      System.out.println(getFib3(n));
    //    }
    System.out.println(100/24);
    System.out.println(100%24);
  }

//    @GetMapping("/")
//    public Object riboonTest(){
//        RestTemplate rest = new RestTemplate();
//        rest.getForObject("http://localhost:")
//    }
}
