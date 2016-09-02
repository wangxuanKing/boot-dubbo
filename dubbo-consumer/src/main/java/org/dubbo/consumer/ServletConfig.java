package org.dubbo.consumer;

import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.remoting.http.servlet.DispatcherServlet;

@Configuration
public class ServletConfig {

	@Bean
	public ServletRegistrationBean servletBean(){
		ServletRegistrationBean servletRegistrationBean  = new ServletRegistrationBean();
		DispatcherServlet servletDubbo = new DispatcherServlet();
		servletDubbo.getInitParameter("load-on-startup");
		servletRegistrationBean.addUrlMappings("/api/");
		servletRegistrationBean.setServlet(servletDubbo);
		return servletRegistrationBean;
	}
}
