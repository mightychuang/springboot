package com.zhy.mySpringboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//@ConfigurationProperties(prefix="my")//对应的属性和配置里的key保持一致，同时属性必须有set访问器
@ConfigurationProperties(locations="classpath:my.properties")
public class MyConfig {
	private String keyOne;
	private String keyTwo;
	
	public void show(){
		System.err.println("keyOne:  "+keyOne+"\n");
		System.err.println("keyTwo: "+keyTwo+"\n");
	}

//	public String getKeyOne() {
//		return keyOne;
//	}

	public void setKeyOne(String keyOne) {
		this.keyOne = keyOne;
	}

//	public String getKeyTwo() {
//		return keyTwo;
//	}

	public void setKeyTwo(String keyTwo) {
		this.keyTwo = keyTwo;
	}
	
	
}
