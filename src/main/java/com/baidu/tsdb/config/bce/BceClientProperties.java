package com.baidu.tsdb.config.bce;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: jiawanneng@uworks.cc
 * @Description:
 * @Date: Create in 2018/1/14 0:05
 */
@ConfigurationProperties(prefix = "baidu.bce")
@Component
public class BceClientProperties {
	//用户的Access Key ID
	private String accessKeyId;
	//用户的Secret Access Key
	private String secretAccessKey;

	private TsdbProperties tsdb;

	public String getAccessKeyId() {
		return accessKeyId;
	}

	public void setAccessKeyId(String accessKeyId) {
		this.accessKeyId = accessKeyId;
	}

	public String getSecretAccessKey() {
		return secretAccessKey;
	}

	public void setSecretAccessKey(String secretAccessKey) {
		this.secretAccessKey = secretAccessKey;
	}

	public TsdbProperties getTsdb() {
		return tsdb;
	}

	public void setTsdb(TsdbProperties tsdb) {
		this.tsdb = tsdb;
	}
}
