package com.egov.controller;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.egov.model.Article;
import com.egov.model.User;
import com.egov.service.ArticleService;
import com.egov.service.UserService;

@Controller
@RequestMapping(value="/")
public class TestController  {
	@Resource
	private UserService userService;
	@Resource
	private ArticleService articleService;
	
	@RequestMapping(value="html", method=RequestMethod.GET)
	public String testHtml(
			@RequestParam(value="id") int id,
			@RequestParam(value="title") String title,
			Model model) throws Exception{
		
		User user = userService.selectUserById(id);
		List<Article> list= articleService.selectArticleByTitle(title);
		Article article =list.get(1);
		System.out.println(user.getUser_name());
		model.addAttribute("username",user.getUser_name());
		model.addAttribute("title",article.getTitle());
		return "test/test";
	}
	
	
	@RequestMapping(value="json", method= RequestMethod.GET)
	@ResponseBody
	public String testJson(int  id, HttpServletResponse response){
		User u= userService.selectUserById(id);
		
		return u.getUser_name();
	}
	
	@RequestMapping(value="/welcome",method= RequestMethod.GET)
	public String welcome(Model model){
		
		return "/project/welcome";
	}
		
	

}
