package com.zhy.mySpringboot.config.DynamicConfig;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.stereotype.Component;

/**
 * 允许程序上下文刷新前，加载程序环境配置，需要在META-INF目录下创建对应factories文件
 * 可实现应用启动时，从网络或者远程某个地方读取配置
 * @author zhy
 *
 */
//@Component
public class DynamicAddConfig implements EnvironmentPostProcessor {
	
	private String path;//可以根据实际情况设置
	
	@Override
	public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
		try{
			InputStream inStream = getInputStringFromPath();
			Properties property = new Properties();
			property.load(inStream);
			PropertiesPropertySource propertySource = new PropertiesPropertySource("my", property);
			environment.getPropertySources().addLast(propertySource);
		}catch(Exception e){
			e.printStackTrace();
		}

	}

	private InputStream getInputStringFromPath() {
		// TODO Auto-generated method stub
		return null;
	}

}
