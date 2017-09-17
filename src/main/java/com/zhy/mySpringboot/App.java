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
//    	ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
    	
    	/**
    	 * 硬编码的方式指定生效文件
    	 * 
    	 * 也可以通过启动时外部配置： --spring.profiles.active=dev,test
    	 * 可以启用多个配置,相同key取最后一次出现的值
    	 */
    	SpringApplication application = new SpringApplication(App.class);
    	application.setAdditionalProfiles("my","test");
    	ConfigurableApplicationContext context = application.run(args);
    	
    	AppConfig appConfig = context.getBean(AppConfig.class);
    	appConfig.show();
    	
    	JdbcConfig jdbcConfig = context.getBean(JdbcConfig.class);
    	jdbcConfig.show();
    	
//    	FileConfig fileConfig = context.getBean(FileConfig.class);
//    	fileConfig.show();
    	
    	MyConfig myConfig = context.getBean(MyConfig.class);
    	myConfig.show();
    	
    	System.out.println("*************currentenv*************"+context.getEnvironment().getProperty("currentenv")+"\n\n");
    	System.out.println("*************time*************"+context.getEnvironment().getProperty("time")+"\n\n");
    	
    	
    }
}
