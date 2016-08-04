package org.dubbo.consumer;

import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.spring.ReferenceBean;

import org.dubbo.baseface.DemoService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 
 * @author wangxuan2
 *
 */
@Configuration
public class ReferServiceConfig extends DubboConfig {

    @Value("${dubbo.reference.check}")
    private boolean isCheckWhenStart;

    @Value("${dubbo.reference.timeout}")
    private int timeout;

    @Value("${dubbo.reference.retries}")
    private int retries;

    @Bean
    public ReferenceConfig referenceConfig() {
        ReferenceConfig rc = new ReferenceConfig();
        rc.setMonitor(monitorConfig());
        return rc;
    }

    @Bean
	public ReferenceBean<DemoService> dubbotest() {
		ReferenceBean<DemoService> ref = new ReferenceBean<DemoService>();
		ref.setInterface(DemoService.class);
		ref.setVersion("LATEST");
		return ref;
	}

}
