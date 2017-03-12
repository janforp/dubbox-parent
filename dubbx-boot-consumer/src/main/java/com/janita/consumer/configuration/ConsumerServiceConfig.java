package com.janita.consumer.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.spring.ReferenceBean;
import com.janita.api.configuration.DubboBaseConfig;
import com.janita.api.service.IFoodService;
import com.janita.api.service.IRiceService;

@Configuration
public class ConsumerServiceConfig extends DubboBaseConfig {

	@Bean
	public ApplicationConfig application(){
		ApplicationConfig applicationConfig = new ApplicationConfig();
		applicationConfig.setName("consumer");
		return applicationConfig;
	}
	
	@Bean
	public ProtocolConfig protocolConfig(){
		ProtocolConfig protocolConfig = new ProtocolConfig();
		protocolConfig.setPort(20882);
		return protocolConfig;
	}
	
	@Bean(name="foodService")
	public ReferenceBean<IFoodService> foodService(){
		ReferenceBean<IFoodService> ref = new ReferenceBean<IFoodService>();
        ref.setVersion("myversion");
        ref.setInterface(IFoodService.class);
        ref.setTimeout(5000);
        ref.setRetries(3);
        ref.setCheck(false);
        return ref;
	}
	

	@Bean(name="riceService")
	public ReferenceBean<IRiceService> riceService(){
		ReferenceBean<IRiceService> ref = new ReferenceBean<IRiceService>();
        ref.setVersion("myversion");
        ref.setInterface(IRiceService.class);
        ref.setTimeout(5000);
        ref.setRetries(3);
        ref.setCheck(false);
        return ref;
	}
}
