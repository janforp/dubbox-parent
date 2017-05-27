package com.janita.food.dubbox;

import com.alibaba.dubbo.config.spring.ServiceBean;
import com.janita.api.service.IFoodOutService;
import com.janita.api.service.IFoodService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Janita on 2017-05-27 09:08
 * 该模块的 dubbo 服务提供配置
 */
@Configuration
@SuppressWarnings("unused")
public class FoodDubboServiceExposeConfig {

    @Value("${service.timeout}")
    private String serviceTimeout;

    @Value("${service.retry.times}")
    private String retryTimes;

    @Bean
    public ServiceBean<IFoodService> foodServiceExpose(IFoodService foodService){
        ServiceBean<IFoodService> serviceBean = new ServiceBean<IFoodService>();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion("v1");
        serviceBean.setInterface(IFoodService.class.getName());
        serviceBean.setRef(foodService);
        serviceBean.setTimeout(Integer.valueOf(serviceTimeout));
        serviceBean.setRetries(Integer.valueOf(retryTimes));
        return serviceBean;
    }

    @Bean
    public ServiceBean<IFoodOutService> foodOutServiceExpose(IFoodOutService foodOutService){
        ServiceBean<IFoodOutService> serviceBean = new ServiceBean<IFoodOutService>();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion("v1");
        serviceBean.setInterface(IFoodOutService.class.getName());
        serviceBean.setRef(foodOutService);
        serviceBean.setTimeout(Integer.valueOf(serviceTimeout));
        serviceBean.setRetries(Integer.valueOf(retryTimes));
        return serviceBean;
    }
}
