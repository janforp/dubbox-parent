package com.janita.food.dubbox;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.janita.api.dubbox.CommonDubboBaseConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Janita on 2017-05-27 09:06
 * 该模块的 dubbo 统一配置
 * 1.applicationName
 * 2.applicationPort
 */
@Configuration
@SuppressWarnings("unused")
public class FoodDubboApplicationConfig extends CommonDubboBaseConfig {

    @Bean
    public ApplicationConfig application(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("foodService");
        return applicationConfig;
    }

    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setPort(Integer.valueOf(dubboPort));
        return protocolConfig;
    }
}
