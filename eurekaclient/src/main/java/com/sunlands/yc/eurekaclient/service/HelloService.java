package com.sunlands.yc.eurekaclient.service;

import org.springframework.stereotype.Service;

//@Service
public interface HelloService {

    String getWarnTime(String warnTimeFlag);

    String updateWarnTime(String warnTimeFlag);
}
