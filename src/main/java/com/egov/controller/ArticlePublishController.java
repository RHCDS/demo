package com.egov.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.egov.model.Article;
import com.egov.model.User;
import com.egov.service.ArticleService;
import com.egov.service.UserService;

@Controller
public class ArticlePublishController {
	@Resource
	private ArticleService articleService;
	@Resource
	private UserService userService;
	
	//log4j
	
	@RequestMapping(value= "/articlepublish",method= RequestMethod.POST)
	public String articlePublish( 
			@RequestParam(value= "title") String title,
			@RequestParam(value= "content") String content, ModelMap model,User user,
			HttpServletRequest  req){
		
		HttpSession session= req.getSession();
		//int user_id = (int)session.getId();
		
		
		Article article= new Article();
		article.setTitle(title);
		article.setContent(content);
	//	article.setUid(user_id);
		int result= articleService.publishArticle(article);
		
		//User user=userService.selectUserById(article.getUid());
		
		model.addAttribute("title", article.getTitle());
		model.addAttribute("content", article.getContent());
		model.addAttribute("curUser",user);
		//model.addAttribute("username",user.getUser_name());
		
		//session.setAttribute("user_id", user.getId());
		
		
		return "article";
	}
}
