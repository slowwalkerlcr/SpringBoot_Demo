package com.example.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.bean.User;
import com.example.service.UserService;

@Controller
@RequestMapping("/user")
public class LoginController {
	
	@Resource
	private UserService userService;

	@RequestMapping(value="/login",method= RequestMethod.POST)
    public String login(User user){
        try{
            if(userService.hasUser(user)){
                return "redirect:/user/index";
            }else{
                return "redirect:/";
            }
        }catch (Exception e){
           System.out.println("登陆失败："+e);
        }
        return  "redirect:/";
    }
	
	 @RequestMapping(value="/index",method= RequestMethod.GET)
	    public String index(){
	        try{

	        }catch (Exception e){
	           System.out.println("登陆失败："+e);
	        }
	        return "index";
	    }
	 
	 @RequestMapping("/tologin")
	 public String tologin(){
		 return "login";
	 }
}
