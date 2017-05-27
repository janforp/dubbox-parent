package com.janita.api.dubbox;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Configuration;

/**
 * 该项目的 dubbo 统一配置
 */
@Configuration
public class CommonDubboBaseConfig {

	@Value("${zk.host.port}")
	private String zkHostPort;

	@Value("${zk.protocol}")
	private String zkProtocol;

	@Value("${dubbo.port}")
	public String dubboPort;

	@Bean
	public RegistryConfig registry(){
		RegistryConfig registryConfig = new RegistryConfig();
		registryConfig.setAddress(zkHostPort);
		registryConfig.setProtocol(zkProtocol);
		return registryConfig;
	}
}