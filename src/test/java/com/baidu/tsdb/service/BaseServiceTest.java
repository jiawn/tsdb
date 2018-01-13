package com.baidu.tsdb.service;

import com.baidu.tsdb.Launch;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author wannengjia@gmail.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Launch.class)
public abstract class BaseServiceTest {  
 protected Logger logger = LoggerFactory.getLogger(getClass());
}
