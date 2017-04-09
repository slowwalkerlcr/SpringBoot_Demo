package com.springboot.lvcr.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@Value("${name}")
	private String name;
	@Value("${springboot.title}")
	private String springboot_title;
	@Value("${springboot.title.desc}")
	private String springboot_title_desc;

	@RequestMapping("/index")
	public String index(ModelMap map) {
		map.addAttribute("name", name);
		map.addAttribute("title", springboot_title);
		map.addAttribute("desc", springboot_title_desc);
		// return模板文件的名称，对应src/main/resources/templates/index.html
		return "index";
	}

}
