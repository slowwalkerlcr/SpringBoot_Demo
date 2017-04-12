package com.example.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.bean.User;
import com.example.service.UserService;


@Controller
public class UserController {
	
	@Resource
	private UserService userService;

	@RequestMapping(value="/login/{id}",method=RequestMethod.GET)
	public @ResponseBody User login(HttpServletRequest req,@PathVariable Integer id){
		User user = userService.selectByPrimaryKey(id);
		return user;
	}
	
	@RequestMapping("/queryAllUser")
	public String query(HttpServletRequest req,Model model){
		List<User> lists = userService.selectAll();
		model.addAttribute("lists", lists);
		return "userList";
	}
}
