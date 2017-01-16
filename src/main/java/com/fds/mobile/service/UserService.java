package com.fds.mobile.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.fds.dao.model.User;

@Service
public interface UserService {

	public List<User> getAllUsers();
	public User save(User user);
	public User update(User user);
	public User delete(Integer id);
	public User getUserById(Integer id);
}
