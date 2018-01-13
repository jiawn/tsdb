package com.baidu.tsdb.config.bce;

/**
 * @Author: jiawanneng@uworks.cc
 * @Description:
 * @Date: Create in 2018/1/14 0:08
 */
public class TsdbProperties {

	// 用户的时序数据库域名，形式如databasename.tsdb.iot.gz.baidubce.com
	private String endpoint;

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
}
