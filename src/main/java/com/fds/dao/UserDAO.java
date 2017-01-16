package com.fds.dao;


import java.util.List;

import com.fds.dao.model.User;


public interface UserDAO {

	public List<User> getAllUsers();
	public User save(User user);
	public User update(User user);
	public User delete(Integer id);
	public User getUserById(Integer id);
}
