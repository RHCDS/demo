package com.egov.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.egov.model.User;
import com.egov.service.UserService;

@Controller
public class LoginController {
	@Resource
	private UserService userService;
	
/*	
	@RequestMapping(value= "/login", method= RequestMethod.POST)
	public String login(
			@RequestParam(value = "username")String username,
			@RequestParam(value = "password") String password , Model model){
		List<User> userResult= userService.selectUserByUsernamePassword(username, password);
		
		if(userResult.size() !=1){
			if(userResult.size() >1)
				return "NO";
			return "register";
		}
		return "OK";
	}*/
}