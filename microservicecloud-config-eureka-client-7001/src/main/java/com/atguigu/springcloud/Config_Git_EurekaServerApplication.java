package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
* @ClassName: Config_Git_EurekaServerApplication
* @Description: TODO(EurekaServer服务器端启动类,接受其它微服务注册进来)
* @author A18ccms a18ccms_gmail_com
* @date 2018年4月19日 下午1:21:40
*
 */
@SpringBootApplication
@EnableEurekaServer
public class Config_Git_EurekaServerApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(Config_Git_EurekaServerApplication.class, args);
	}
}
