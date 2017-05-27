package com.janita.api.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboBaseConfig {

	@Value("zk.host.port")
	private String zkHostPort;

	@Value("zk.protocol")
	private String zkProtocol;

	@Bean
	public RegistryConfig registry(){
		RegistryConfig registryConfig = new RegistryConfig();
		registryConfig.setAddress(zkHostPort);
		registryConfig.setProtocol(zkProtocol);
		return registryConfig;
	}
}