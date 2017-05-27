package com.janita.consumer.dubbox;

import com.janita.api.service.IFoodOutService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.spring.ReferenceBean;
import com.janita.api.dubbox.CommonDubboBaseConfig;
import com.janita.api.service.IFoodService;
import com.janita.api.service.IRiceService;

@Configuration
@SuppressWarnings("unused")
public class ConsumerServiceImportConfig {

    @Value("${service.timeout}")
    private String serviceTimeout;

    @Value("${service.retry.times}")
    private String retryTimes;

	@Bean(name="foodService")
	public ReferenceBean<IFoodService> foodService(){
		ReferenceBean<IFoodService> ref = new ReferenceBean<IFoodService>();
        ref.setVersion("v1");
        ref.setInterface(IFoodService.class);
        ref.setTimeout(Integer.valueOf(serviceTimeout));
        ref.setRetries(Integer.valueOf(retryTimes));
        ref.setCheck(false);
        return ref;
	}
	@Bean(name="riceService")
	public ReferenceBean<IRiceService> riceService(){
		ReferenceBean<IRiceService> ref = new ReferenceBean<IRiceService>();
        ref.setVersion("v1");
        ref.setInterface(IRiceService.class);
        ref.setTimeout(Integer.valueOf(serviceTimeout));
        ref.setRetries(Integer.valueOf(retryTimes));
        ref.setCheck(false);
        return ref;
	}

    @Bean(name="foodOutService")
    public ReferenceBean<IFoodOutService> foodOutService() {
        ReferenceBean<IFoodOutService> ref = new ReferenceBean<IFoodOutService>();
        ref.setVersion("v1");
        ref.setInterface(IFoodOutService.class);
        ref.setTimeout(Integer.valueOf(serviceTimeout));
        ref.setRetries(Integer.valueOf(retryTimes));
        ref.setCheck(false);
        return ref;
    }
}
