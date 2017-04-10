package com.springboot.lvcr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.lvcr.PersonService;

/**
 * 
 * @TODO ADD REASON
 * @Date 2017年4月10日 下午5:34:16
 * @author Edison_lv
 * @version
 */
@RestController
public class PersonServiceController {
	@Autowired
	// 自动注入PersonService
	private PersonService personService;

	@GetMapping("get/name")
	public String getPersonName() {
		return personService.getPersonName();// 调用PersonService服务的方法
	}

	@GetMapping("get/sex")
	public String getPersonSex() {
		return personService.getPersonSex();
	}
}
