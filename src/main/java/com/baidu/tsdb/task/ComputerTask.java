package com.baidu.tsdb.task;

import com.baidu.tsdb.util.ComputerUtil;
import com.baidubce.services.tsdb.TsdbClient;
import com.baidubce.services.tsdb.model.Datapoint;
import org.hyperic.sigar.CpuPerc;
import org.hyperic.sigar.SigarException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: jiawanneng@uworks.cc
 * @Description:
 * @Date: Create in 2018/1/14 1:02
 */

@Component
public class ComputerTask {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Resource TsdbClient tsdbClient;
	String METRIC = "cpu_idle";                                          // metric
	String TAG_KEY = "server";                                           // 标签名称
	String TAG_VALUE = "server1";                                        // 标签值

	/**
	 * CPU使用监测
	 */
	@Scheduled(cron = "*/3 * * * * ?")
	public void test() throws SigarException, UnknownHostException {
		Long now = System.currentTimeMillis();
		List<CpuPerc> cpuInfos = ComputerUtil.cpuInfo();
		List<Datapoint> datapoints = new ArrayList<>();
		for (int i = 1; i <=cpuInfos.size(); i++) {
			// 添加数据点
			datapoints.add(new Datapoint()
					.withMetric(METRIC)                                     // 设置Metric
					.withField("CPU_" + i)                                     // 设置域1
					.addTag(TAG_KEY, TAG_VALUE)                             // 设置Tag
					.addDoubleValue(now, cpuInfos.get(i-1).getCombined()));                             // 指定时间写入Double类型数据点
		}
		tsdbClient.writeDatapoints(datapoints);
	}

}
