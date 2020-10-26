package org.t229.demo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.t229.demo.pojo.Users;
import org.t229.demo.service.UserService;

@Controller
public class LoginController {
	
	@Resource
	UserService userService;
	
	@RequestMapping(value="/toLogin")
	public String login(){
		return "login";
	}
	
	@RequestMapping(value="/doLogin",method=RequestMethod.POST)
	public String doLogin(String userName,String userpassword){
		Users users = userService.doLogin(userName, userpassword);
		if(users!=null){
		   return "success";	
		}
		
		return "login";
	}

}
