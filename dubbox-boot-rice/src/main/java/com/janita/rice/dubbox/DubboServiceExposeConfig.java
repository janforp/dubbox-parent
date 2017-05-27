package com.janita.rice.dubbox;

import com.alibaba.dubbo.config.spring.ServiceBean;
import com.janita.api.service.IFoodService;
import com.janita.api.service.IRiceService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Janita on 2017-05-27 09:08
 * 该模块的 dubbo 服务提供配置
 */
@Configuration
@SuppressWarnings("unused")
public class DubboServiceExposeConfig {

    @Value("${service.timeout}")
    private String serviceTimeout;

    @Value("${service.retry.times}")
    private String retryTimes;

    @Bean
    public ServiceBean<IRiceService> materialServiceExport(IRiceService riceService){
        ServiceBean<IRiceService> serviceBean = new ServiceBean<IRiceService>();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion("v1");
        serviceBean.setInterface(IRiceService.class.getName());
        serviceBean.setRef(riceService);
        serviceBean.setTimeout(Integer.valueOf(serviceTimeout));
        serviceBean.setRetries(Integer.valueOf(retryTimes));
        return serviceBean;
    }
}
