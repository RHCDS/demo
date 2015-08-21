package com.egov.springtest;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SpringTest {
	public static void main(String[] args) throws Exception {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		DataSource dataSource= context.getBean("dataSource",DataSource.class);
		String str= "insert into user_t values(null,?,?,?)";

		Connection c= dataSource.getConnection();
		PreparedStatement statement= c.prepareStatement(str);
		
		//statement.setInt(1, 0);
		statement.setString(1, "小毛");
		statement.setString(2, "123");
		statement.setInt(3, 12);
		

		statement.execute();
	}
}
