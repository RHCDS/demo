package com.egov.mybatiestest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





import com.egov.dao.ArticleDAO;
import com.egov.model.Article;



public class ArticleTest {
	public static void main(String[] args) {
		//读取配置文件
		ApplicationContext ctx=null;  
		      ctx=new ClassPathXmlApplicationContext("spring.xml");  
		
	   //获取对应的mapping中的 .xml 文件
		//UserDAO userMapper=(UserDAO)ctx.getBean(UserDAO.class); 
		 ArticleDAO at=(ArticleDAO)ctx.getBean(ArticleDAO.class);
		
		Article a= new Article();
		a.setUid(1);
		a.setTitle("Hello");
		a.setContent("13");
		
		at.publishArticle(a);
		System.out.println("插入成功");
		
	}
}