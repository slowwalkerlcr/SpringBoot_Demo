package com.springboot.lvcr.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * @TODO ADD REASON
 * @Date 2017年4月11日 上午10:48:53
 * @author Edison_lv
 * @version
 */
@Controller
public class HelloController {
	@Value("${name}")
	private String uname;
	
	@Value("${age}")
	private String age;
	
	

	//@ApiOperation("第一个thymeleaf程序")
	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public String greeting(
			@RequestParam(name = "name", required = false, defaultValue = "world") String name,
			Model model) {
		model.addAttribute("xname", name+":"+uname+":"+age);
		return "greet";
	}
}
