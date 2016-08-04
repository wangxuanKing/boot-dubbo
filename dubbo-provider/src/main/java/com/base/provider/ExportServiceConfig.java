package com.base.provider;

import org.dubbo.baseface.DemoService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.ProviderConfig;
import com.alibaba.dubbo.config.spring.ReferenceBean;
import com.alibaba.dubbo.config.spring.ServiceBean;

/**
 * 
 * @decription:
 * @author wangxuan2
 * @date 2016骞�8鏈�4鏃� 涓婂崍9:57:26
 */
@Configuration
public class ExportServiceConfig extends DubboBaseConfig {


    @Value("${dubbo.export.port}")
    private int port;

    @Value("${dubbo.export.version}")
    private String exportVersion;

    @Value("${dubbo.export.timeout}")
    private int timeout;

    @Value("${dubbo.export.retries}")
    private int retries;

    @Bean
    public ProtocolConfig protocol() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setPort(port);
        return protocolConfig;
    }


    @Bean
    public ProviderConfig provider() {
        ProviderConfig providerConfig = new ProviderConfig();
        providerConfig.setMonitor(monitorConfig());
        return providerConfig;
    }

    @Bean
    public ServiceBean<DemoService> psPrescriptionItemServiceExport(DemoService demoService) {
        ServiceBean<DemoService> serviceBean = new ServiceBean<DemoService>();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion(exportVersion);
        serviceBean.setInterface(DemoService.class.getName());
        serviceBean.setRef(demoService);
        serviceBean.setTimeout(timeout);
        serviceBean.setRetries(retries);
        return serviceBean;
    }
    
}
