package com.egov.controller;

import java.io.Writer;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.egov.model.User;
import com.egov.service.UserService;


@Controller
@RequestMapping(value="/")
public class UserController {
	@Resource
	private UserService userService;
	
	
	@RequestMapping(value="login", method= RequestMethod.GET)
	public String loginWelcome(Model model){
		
		return "/project/login";
	}
	
	
	@RequestMapping(value="login", method= RequestMethod.POST)
	public @ResponseBody User login(HttpServletRequest request,
			HttpServletResponse response, Model model) throws Exception{
		
		String username= request.getParameter("username1");
		String password =request.getParameter("password1");
		
		List<User> list=userService.selectUserByUsernamePassword(username, password);
		User user=list.get(0);
		
		System.out.println("username= "+username+ "	password="+password);	
		return user;
	}
	
	
	@RequestMapping(value="register", method= RequestMethod.GET)
	public String registerWelcome(){
		
		return "/project/register";
	}
	
	@RequestMapping(value="register", method=RequestMethod.POST)
	@ResponseBody
	public User register(
			HttpServletRequest request,
			HttpServletResponse response
			)throws Exception{
		String username= request.getParameter("username");
		String password =request.getParameter("password");
		String strAge= request.getParameter("age");
		int age=Integer.valueOf(strAge).intValue();
		
		
		User newUser= new User();
		newUser.setAge(age);
		newUser.setUser_name(username);
		newUser.setPassword(password);
		
		userService.insertUser(newUser);
		
		List<User> list=userService.selectUserByUsernamePassword(username, password);
		User user=list.get(0);
		System.out.println(user.getUser_name());
		return user;
	}
}
