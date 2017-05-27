package com.janita.consumer.dubbox;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.janita.api.dubbox.CommonDubboBaseConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Janita on 2017-05-27 10:45
 */
@Configuration
@SuppressWarnings("unused")
public class ConsumerDubboApplicationConfig extends CommonDubboBaseConfig {

    @Bean
    public ApplicationConfig application(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("consumer");
        return applicationConfig;
    }

    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setPort(Integer.valueOf(dubboPort));
        return protocolConfig;
    }
}
