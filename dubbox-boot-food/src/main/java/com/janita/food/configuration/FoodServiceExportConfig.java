package com.janita.food.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.spring.ServiceBean;
import com.janita.api.configuration.DubboBaseConfig;
import com.janita.api.service.IFoodService;

@Configuration
public class FoodServiceExportConfig extends DubboBaseConfig {

	@Bean
	public ServiceBean<IFoodService> materialServiceExport(IFoodService foodService){
		ServiceBean<IFoodService> serviceBean = new ServiceBean<IFoodService>();
		serviceBean.setProxy("javassist");
		serviceBean.setVersion("myversion");
		serviceBean.setInterface(IFoodService.class.getName());
		serviceBean.setRef(foodService);
		serviceBean.setTimeout(5000);
		serviceBean.setRetries(3);
		return serviceBean;
	}
	
	@Bean
	public ApplicationConfig application(){
		ApplicationConfig applicationConfig = new ApplicationConfig();
		applicationConfig.setName("foodService");
		return applicationConfig;
	}
	
	@Bean
	public ProtocolConfig protocolConfig(){
		ProtocolConfig protocolConfig = new ProtocolConfig();
		protocolConfig.setPort(20880);
		return protocolConfig;
	}
}
