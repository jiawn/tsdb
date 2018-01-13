package com.baidu.tsdb.config.bce;

import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.services.tsdb.TsdbClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @Author: jiawanneng@uworks.cc
 * @Description:
 * @Date: Create in 2018/1/14 0:12
 */
@Configuration
public class BceConfiguration {

	@Autowired
	BceClientProperties bceClientProperties;

	@Bean
	@ConditionalOnMissingBean
	public BceClientConfiguration bceClientConfiguration() {
		// 创建配置
		BceClientConfiguration config = new BceClientConfiguration()
				.withCredentials(
						new DefaultBceCredentials(bceClientProperties.getAccessKeyId(), bceClientProperties.getSecretAccessKey()));
		return config;
	}

	@Bean
	@ConditionalOnMissingBean
	public TsdbClient tsdbClient(BceClientConfiguration bceClientConfiguration) {
		bceClientConfiguration.withEndpoint(bceClientProperties.getTsdb().getEndpoint());
		// 初始化一个TsdbClient
		TsdbClient tsdbClient = new TsdbClient(bceClientConfiguration);
		return tsdbClient;
	}



}
