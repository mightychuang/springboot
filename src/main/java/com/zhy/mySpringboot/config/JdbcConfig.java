package com.zhy.mySpringboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JdbcConfig {
	
	@Value("${url}")
	private String url;
	@Value("${driver}")
	private String driver;
	@Value("${name}")
	private String name;
	@Value("${pwd}")
	private String pwd;
	
	
	public void show(){
		System.err.println("url:  "+url+"\n");
		System.err.println("driver:  "+driver+"\n");
		System.err.println("name:  "+name+"\n");
		System.err.println("pwd:  "+pwd+"\n");
	}
	

}
