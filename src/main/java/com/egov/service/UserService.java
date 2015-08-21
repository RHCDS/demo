package com.egov.service;

import java.sql.ResultSet;
import java.util.List;

import com.egov.model.User;

public interface UserService {
	public int insertUser(User user);
	public List<User> selectUserByUsernamePassword(String username, String password);
	public User selectUserById(int id);
	public List<User> selectUserByFull(String username, String password, int age);
	
	
	public ResultSet selectUserByUsernameAndPassword(String username, String password);
	
}
