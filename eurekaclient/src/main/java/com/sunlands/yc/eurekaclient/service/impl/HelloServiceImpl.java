package com.sunlands.yc.eurekaclient.service.impl;

import com.sunlands.yc.eurekaclient.service.HelloService;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class HelloServiceImpl implements HelloService {
    /**
     * 集成 spring cache
     * @param warnTimeFlag
     * @return
     */
    @Cacheable(value="HiSpace",key = "#warnTimeFlag")
    @Override
    public String getWarnTime(String warnTimeFlag) {
        String formatTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println(">> this date flag is : "+formatTime);
        return formatTime;
    }

    @CachePut(value="HiSpace",key = "#warnTimeFlag")
    @Override
    public String updateWarnTime(String warnTimeFlag) {
    System.out.println("will be UPDATE this flag");
        return getWarnTime(warnTimeFlag);
    }
}
