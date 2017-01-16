package com.fds.mobile.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fds.dao.UserDAO;
import com.fds.dao.model.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;
	
	@Transactional
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return this.userDAO.getAllUsers();
	}

	@Transactional
	public User save(User user) {
		// TODO Auto-generated method stub
		return this.userDAO.save(user);
	}

	@Transactional
	public User update(User user) {
		// TODO Auto-generated method stub
		return this.userDAO.update(user);
	}

	@Transactional
	public User delete(Integer id) {
		// TODO Auto-generated method stub
		return this.userDAO.delete(id);
	}

	@Transactional
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		return this.userDAO.getUserById(id);
	}

}
