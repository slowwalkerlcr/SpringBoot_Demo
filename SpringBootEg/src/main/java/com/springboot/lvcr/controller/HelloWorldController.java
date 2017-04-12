package com.springboot.lvcr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloWorldController {
	
	@RequestMapping("/hello.action")
	public String hello(){
		
		return "hello world";
	}

}
