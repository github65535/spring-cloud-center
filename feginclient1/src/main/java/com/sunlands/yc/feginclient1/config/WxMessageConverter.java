package com.sunlands.yc.feginclient1.config;


import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.ArrayList;
import java.util.List;

// 创建一个新的转换器 解析 [text/plain]
public class WxMessageConverter extends MappingJackson2HttpMessageConverter {
  public WxMessageConverter() {
    List<MediaType> mediaTypes = new ArrayList<>();
    mediaTypes.add(MediaType.TEXT_PLAIN);
    setSupportedMediaTypes(mediaTypes);
  }
}