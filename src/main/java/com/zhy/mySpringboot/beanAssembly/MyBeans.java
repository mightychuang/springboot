package com.zhy.mySpringboot.beanAssembly;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class MyBeans {
	
	@Bean
//	@Profile({""})默认所有环境都生效
	public Runnable createRunable(){
		System.err.println("=====create=====one=====");
		return () -> System.err.println("===run ===one==");
	}
	
	@Bean
	@Profile({"dev"})//dev 环境才生效，可以指定多个
	public Runnable createRunableDev(){
		System.err.println("=====create=====dev=====");
		return () -> System.err.println("===run =====dev=======");
	}
	@Bean
	@Profile({"test","my"})//test,my 两个环境都生效，可以指定多个
	public Runnable createRunableTest(){
		System.err.println("=====create=====test,my=====");
		return () -> System.err.println("===run =====test,my=======");
	}

}
