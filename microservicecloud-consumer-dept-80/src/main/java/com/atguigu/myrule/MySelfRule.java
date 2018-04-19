package com.atguigu.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
* @ClassName: MySelfRule
* @Description: TODO(这里用一句话描述这个类的作用)
* @author A18ccms a18ccms_gmail_com
* @date 2018年4月18日 下午6:34:03
* 
* 这个自定义配置类不能放在@ComponentScan所扫描的当前包下以及子包下，
* 否则我们自定义的这个配置类就会被所有的Ribbon客户端所共享，也就是说
* 我们达不到特殊化定制的目的了
 */
@Configuration
public class MySelfRule
{
	@Bean
	public IRule myRule() {
		//return new RandomRule(); //Ribbon默认轮询, 改为随机
		return new RandomRule_Le(); // 定义为每个机器被访问5次
	}
}
