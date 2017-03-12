package com.janita.rice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.spring.ServiceBean;
import com.janita.api.configuration.DubboBaseConfig;
import com.janita.api.service.IRiceService;

@Configuration
public class RiceServiceExportConfig extends DubboBaseConfig {

	@Bean
	public ServiceBean<IRiceService> materialServiceExport(IRiceService riceService){
		ServiceBean<IRiceService> serviceBean = new ServiceBean<IRiceService>();
		serviceBean.setProxy("javassist");
		serviceBean.setVersion("myversion");
		serviceBean.setInterface(IRiceService.class.getName());
		serviceBean.setRef(riceService);
		serviceBean.setTimeout(5000);
		serviceBean.setRetries(3);
		return serviceBean;
	}
	
	@Bean
	public ApplicationConfig application(){
		ApplicationConfig applicationConfig = new ApplicationConfig();
		applicationConfig.setName("riceService");
		return applicationConfig;
	}
	
	@Bean
	public ProtocolConfig protocolConfig(){
		ProtocolConfig protocolConfig = new ProtocolConfig();
		protocolConfig.setPort(20881);
		return protocolConfig;
	}
}
