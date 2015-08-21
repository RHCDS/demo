package com.egov.mybatiestest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.egov.dao.UserDAO;
import com.egov.model.User;


public class MybatisTest {
	public static void main(String[] args) {
		//读取配置文件
		ApplicationContext ctx=null;  
		      ctx=new ClassPathXmlApplicationContext("spring.xml");  
		
	   //获取对应的mapping中的 .xml 文件
		UserDAO userMapper=(UserDAO)ctx.getBean(UserDAO.class); 
		
		//设置对应的传入参数
		User u= new User();
		u.setUser_name("小名");
		u.setPassword("1234");
		u.setAge(12);
		
		userMapper.intsertUser(u);
		System.out.println("插入成功");
		
	}
}
