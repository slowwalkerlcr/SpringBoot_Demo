package com.springboot.lvcr.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * TODO 获取application.peoperties参数演示
 * @Date  2017年4月9日 下午10:39:20   	 
 * @author Administrator  
 * @version
 */
@RestController
public class ParamController {
	@Value("${name}")
	private String name;
	@Value("${springboot.title}")
	private String springboot_title;
	@Value("${springboot.title.desc}")
	private String springboot_title_desc;

	@RequestMapping("/param")
	public String param() {
		return "name："+name+ ",   springboot_title： "+springboot_title +" ,springboot_title_desc:"+springboot_title_desc;
	}
}
