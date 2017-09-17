package com.zhy.mySpringboot.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="my")//对应的属性和配置里的key保持一致，同时属性必须有set访问器
//@ConfigurationProperties(locations="classpath:my.properties")
public class MyConfig {
	private String keyOne;
	private String keyTwo;
	private List<String> Lkeys = new ArrayList<>();
//	private List<String> Lkeys ; 此种写法必须带上对应的set访问器
	
	private String[] Keys;
	
	public void show(){
		System.err.println("keyOne:  "+keyOne+"\n");
		System.err.println("keyTwo: "+keyTwo+"\n");
		System.err.println("Lkeys: "+Lkeys+"\n");
		System.err.println("myKeys: "+Arrays.asList(Keys)+"\n");
		
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

	public String[] getKeys() {
		return Keys;
	}

	public void setKeys(String[] keys) {
		Keys = keys;
	}

	//get访问器必须带上
	public List<String> getLkeys() {
		return Lkeys;
	}

//	public void setLkeys(List<String> lkeys) {
//		Lkeys = lkeys;
//	}
	
	
	
}
