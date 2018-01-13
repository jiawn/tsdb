package com.baidu.tsdb.service;

import com.baidubce.BceClientConfiguration;
import com.baidubce.services.tsdb.TsdbClient;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * @author wannengjia@gmail.com
 *
 */
public class SystemUpdateInit extends BaseServiceTest{

  private static Logger logger = LoggerFactory.getLogger(SystemUpdateInit.class);
  @Resource BceClientConfiguration configuration;
  @Resource TsdbClient tsdbClient;
  @Test
  public void test() {

    logger.info("==================系统接口测试开始==================");

        
      
     
    logger.info("==================系统接口测试开始==================");
  }

}
