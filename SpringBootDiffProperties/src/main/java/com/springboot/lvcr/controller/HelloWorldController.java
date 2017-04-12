package com.springboot.lvcr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.lvcr.bean.CommonBean;


@RestController
public class HelloWorldController {
	@Autowired
	private CommonBean commonBean;
	
	@Value("${demo1.user.name}")
	private String demo1_name;
	
	@Value("${demo2.user.name}")
	private String demo2_name;
	
	
	@RequestMapping("/common")
	public String common(){
		return "commonBean:"+commonBean.getName()+","+commonBean.getAge();
	}
	
	
	@RequestMapping("/demo1")
	public String demo1(){
		return demo1_name;
	}
	
	
	@RequestMapping("/demo2")
	public String demo2(){
		return demo2_name;
	}

}
