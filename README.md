# 百度时序数据库(TSDB)测试基于Springboot


一、所需环境
	1、jdk 1.8
	2、maven 3.0+，构建工具
	3、mysql 5.5+，数据库
	4、Eclipse 4.0+，IDE工具
	5、git 1.7+，代码版本管理工具

二、终端中执行下面命令，转成Eclipse工程，即可导入到Eclipse中
	mvn eclipse:eclipse
	
三、启动
	1、eclipse中，直接 run Launch.java
	
五、目录说明
	src/main/java/**/constants：系统常量
	src/main/java/**/config：系统配置
	src/main/java/**/domain/enums：实体使用的枚举
	src/main/java/**/exception：平台定义异常
	src/main/java/**/service：服务层，封装各个业务的处理
	src/main/java/**/util：工具类
	
	src/main/resources/application.yml：系统具体配置项文件
	src/main/resources/log.xml：系统日志配置
