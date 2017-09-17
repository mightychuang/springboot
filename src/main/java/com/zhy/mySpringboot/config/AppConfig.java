package com.zhy.mySpringboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


/**
 * 配置文件默认名字：application.properties
 * 配置文件默认路径：classpath:/ 或者 classpath:/config 或者file:/ 或者file:config/
 * 
 * 修改默认配置文件名字： --spring.config.name=文件名  ，文件的拓展名字不用带上
 * 修改默认配置目录： --spring.config.location指定全路径名，多个用逗号隔开，同样可以是classpath和file两种方式 
 * 
 * 
 * 
 * 
 * @author zhy
 *
 */
@Component
public class AppConfig {
	@Autowired
	private Environment env;
	@Value("${local.ip:111}")
	private String ip;
	
	@Value("${tomcat.path:value-defaultpath}")
	private String tomatPath;
	
	@Value("${tomcat.port:9999}")
	private Integer tomcatPort;
	
	public void show(){
		System.err.println("local.ip:  "+ip+"\t port:"+env.getProperty("local.port")+"\n");
		System.err.println("name: "+env.getProperty("name")+"\n");
		System.err.println("app.name:  "+env.getProperty("app.name")+"\n");
		System.err.println("value:tomatPath:  "+tomatPath+"\n");
		System.err.println("env:tomatPath:  "+env.getProperty("tomcat.path","env-defaultpath")+"\n");
		System.err.println("env:tomcatPort:  "+env.getProperty("tomcat.port","env-9999")+"\n");
		System.err.println("value:tomcatPort:  "+tomcatPort+"\n");
		
	}
}
