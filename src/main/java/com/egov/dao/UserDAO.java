package com.egov.dao;

import java.sql.ResultSet;
import java.util.List;

import com.egov.model.User;

public interface UserDAO {
	public int intsertUser(User user);
	public List<User> selectUserByUsernamePassword(String username, String password);
	public User selectUserById(int id);
	public List<User> selectUserByFull(String username, String password,int age);
	
	public ResultSet selectUserByUsernameAndPassword(String username, String password);
}