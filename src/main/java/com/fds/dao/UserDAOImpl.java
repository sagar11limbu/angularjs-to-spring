package com.fds.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fds.dao.model.User;


//makes a repository for a userDAO in IOC container of Spring
@Repository("userDAO")
public class UserDAOImpl implements UserDAO{

	//Autowiring the beans of sessionfactory present in IOC container
	@Autowired
	private SessionFactory sessionFactory;
	
	//hibernate session different from HTTP session
	private Session session;
	//hibernate transaction
	private Transaction trans;
	
	
	//this method list all the users in the database and return it in the form of list
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		session=sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<User> users=session.createQuery("from User").list(); //returning the query which is in object form
		session.close();
		return users;
	}

	//this method saves the user
	public User save(User user) {
		// TODO Auto-generated method stub
		session=sessionFactory.openSession();
		trans=session.beginTransaction();
		session.save(user); //saves the user
		trans.commit();
		session.close();
		return user;
	}

	//update the user 
	public User update(User user) {
		// TODO Auto-generated method stub
		session=sessionFactory.openSession();
		trans=session.beginTransaction();
		session.update(user); //updates the users
		trans.commit();
		session.close();
		return user;
	}

	//This methos deletes the user in the basis of id provided by user
	public User delete(Integer id) {
		// TODO Auto-generated method stub
		session=sessionFactory.openSession();
		trans=session.beginTransaction();
		User user=(User)session.get(User.class, id); //retreiving the user id
		session.delete(user);//deleting the user
		trans.commit();
		session.close();
		return null;
	}

	
	//This method returns the user on the basis of id
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		session=sessionFactory.openSession();
		trans=session.beginTransaction();
		User user=(User)session.get(User.class, id);
		trans.commit();
		session.close();
		return user;
	}

}
