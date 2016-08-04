package com.base.test.service;

import org.dubbo.baseface.DemoService;
import org.springframework.stereotype.Service;


@Service
public class DemoServiceImpl  implements DemoService{

	public String sayHello() {
		System.out.println("dubbo test ok!!!");
		return "hello world!";
	}

}
