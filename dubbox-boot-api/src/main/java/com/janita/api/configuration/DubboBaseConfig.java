package com.janita.api.configuration;

import org.springframework.context.annotation.Bean;

import com.alibaba.dubbo.config.RegistryConfig;

public class DubboBaseConfig {

	@Bean
	public RegistryConfig registry(){
		RegistryConfig registryConfig = new RegistryConfig();
		registryConfig.setAddress("127.0.0.1:2181");
		registryConfig.setProtocol("zookeeper");
		return registryConfig;
	}
}
