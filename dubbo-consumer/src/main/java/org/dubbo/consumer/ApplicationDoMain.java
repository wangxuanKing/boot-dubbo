package org.dubbo.consumer;

import org.dubbo.baseface.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * 主程序
 * @author wangxuan
 *
 */
@SpringBootApplication
@ComponentScan("org.dubbo.protest")
@RestController
public class ApplicationDoMain implements EmbeddedServletContainerCustomizer
{
	
	@Autowired
	private DemoService demoService;
	
    public static void main( String[] args )
    {
    	SpringApplication.run(ApplicationDoMain.class, args);
    }
    
    @RequestMapping("/testdubbo")
    public String testDubbo(){
    	demoService.sayHello();
    	return "ok";
    }

	public void customize(ConfigurableEmbeddedServletContainer container) {
		// TODO Auto-generated method stub
		container.setPort(8081);
	}
    
}
