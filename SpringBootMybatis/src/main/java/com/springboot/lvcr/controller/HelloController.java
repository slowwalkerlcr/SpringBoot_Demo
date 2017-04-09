package com.springboot.lvcr.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.github.pagehelper.PageHelper;
import com.springboot.lvcr.model.Message;
import com.springboot.service.IMessageService;

public class HelloController {
	@Resource
	private IMessageService messageService;

	@GetMapping("/message")
	public String message(Model model) {
		List<Message> messages = messageService.findMessage();
		model.addAttribute("messages", messages);

		return "message";
	}

	@GetMapping("/getMessages/{currentPage}")
	public String getMessages(@PathVariable("currentPage") Integer currentPage,
			Model model) {
		if (currentPage != null) {
			PageHelper.startPage(currentPage, 10);
		}
		List<Message> messages = messageService.findMessage();
		model.addAttribute("messages", messages);
		return "message";
	}
}
