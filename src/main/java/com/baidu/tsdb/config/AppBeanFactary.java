package com.baidu.tsdb.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * 生成特殊bean的工厂bean, 有些第三方的Bean没有标注@component, 需要手工初始化.
 *
 * @author wannengjia@gmail.com
 */
@Configuration
@EnableConfigurationProperties
public class AppBeanFactary {

  @Resource
  private AppConfig appConfig;



}
