package com.egov.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.egov.model.User;
import com.egov.service.UserService;


/*@Controller
public class RegisterController {

	@Resource
	private UserService userService;
	
		
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(@RequestParam(value = "name") String name, 
			@RequestParam(value="password") String password ,
			@RequestParam(value = "age") String age, Model model){
		
		User newUser = new User();
		newUser.setAge(Integer.parseInt(age));
		newUser.setPassword(password);
		newUser.setUser_name(name);
		int result = userService.insertUser(newUser);
		if(result == 0){
			System.out.println("innter error");
			return "NO";
		}
		model.addAttribute("username",newUser.getUser_name());
		model.addAttribute(newUser.getId());
		return "OK";
	}
}
*/