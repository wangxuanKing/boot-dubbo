package com.base.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * 
 * @decription:
 * @author wangxuan2
 * @date 2016年8月4日 上午9:21:23
 */
@SpringBootApplication
@ComponentScan("com.base")
public class ApplicationMain {
	
    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain.class, args);
    }

}
