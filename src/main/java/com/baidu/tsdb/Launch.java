package com.baidu.tsdb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.concurrent.CountDownLatch;

/**
 * Spring Boot启动主类
 *
 * @author wannengjia@gmail.com
 */
@SpringBootApplication
@EnableScheduling
public class Launch {
	private static final Logger logger = LoggerFactory.getLogger(Launch.class);

	/**
	 * 应用程序入口
	 */
	public static void main(String[] args) throws InterruptedException {
		ApplicationContext ctx = new SpringApplicationBuilder()
				.sources(Launch.class)
				.web(false)
				.listeners(new SystemInit())
				.run(args);
		logger.info("项目启动!");

		// 阻塞主线程，防止服务自动销毁
		CountDownLatch closeLatch = ctx.getBean(CountDownLatch.class);
		closeLatch.await();

	}

	@Bean
	public CountDownLatch closeLatch() {
		return new CountDownLatch(1);
	}
}

