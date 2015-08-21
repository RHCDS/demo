package com.egov.serviceImpl;

import java.sql.ResultSet;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.egov.dao.UserDAO;
import com.egov.model.User;
import com.egov.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserDAO userDAO;
	
	@Override
	public int insertUser(User user) {	
		return userDAO.intsertUser(user);
	}

	@Override
	public List<User> selectUserByUsernamePassword(String username,String password) {
		return userDAO.selectUserByUsernamePassword(username, password);
	}

	@Override
	public List<User> selectUserByFull(String username, String password, int age) {
		return userDAO.selectUserByFull(username, password, age);
	}

	
	@Override
	public User selectUserById(int id) {
		return userDAO.selectUserById(id);
	}

	@Override
	public ResultSet selectUserByUsernameAndPassword(String username,
			String password) {
		
		return userDAO.selectUserByUsernameAndPassword( username, password);
	}
	
}