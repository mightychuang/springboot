package com.zhy.mySpringboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;


/**
 * 如果多个配置文件里有相同的key 则取最后一次出现的值
 * 
 * 这种写法主要是为了引入多个配置文件，使得配置类可以正常使用多个配置文件
 * @author zhy
 *
 */
@Configuration
@PropertySource("classpath:ds.properties")//可以多个同时使用，也可以使用@PropertySources一次指定多个配置
@PropertySource("classpath:my.properties")//可以多个同时使用，也可以使用@PropertySources一次指定多个配置

@PropertySource({"classpath:ds.properties","classpath:my.properties"})//也可以
//@PropertySources(
//		{@PropertySource("classpath:ds.properties"),  
//		 @PropertySource("classpath:my.properties")})
//@Component
public class FileConfig {
//	@Value("${url}")
//	private String url;
//	@Value("${driver}")
//	private String driver;
//	@Value("${name}")
//	private String name;
//	@Value("${pwd}")
//	private String pwd;
//	
//	
//	public void show(){
//		System.err.println("url:  "+url+"\n");
//		System.err.println("driver:  "+driver+"\n");
//		System.err.println("name:  "+name+"\n");
//		System.err.println("pwd:  "+pwd+"\n");
//	}
}
