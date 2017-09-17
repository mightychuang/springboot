package com.zhy.mySpringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.zhy.mySpringboot.config.AppConfig;
import com.zhy.mySpringboot.config.JdbcConfig;
import com.zhy.mySpringboot.config.MyConfig;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
    	ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
    	
    	AppConfig appConfig = context.getBean(AppConfig.class);
    	appConfig.show();
    	
    	JdbcConfig jdbcConfig = context.getBean(JdbcConfig.class);
    	jdbcConfig.show();
    	
//    	FileConfig fileConfig = context.getBean(FileConfig.class);
//    	fileConfig.show();
    	
    	MyConfig myConfig = context.getBean(MyConfig.class);
    	myConfig.show();
    	
    	
    }
}
