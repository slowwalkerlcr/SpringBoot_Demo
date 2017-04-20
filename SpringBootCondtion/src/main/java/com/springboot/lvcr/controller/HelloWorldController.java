package com.springboot.lvcr.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
	
	//@Value("${user.namessss}")
	private String userName;
	
	
	@RequestMapping("/hello")
	public String hello(){
		System.out.println(userName);
		return "Hello Spring Boot";
	}

}
