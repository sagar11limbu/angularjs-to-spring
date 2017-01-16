package com.fds.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fds.dao.model.User;
import com.fds.mobile.service.RecommendationService;
import com.fds.mobile.service.UserService;
import com.fds.model.FraudUsers;

@Controller
public class RecommendationController {
	
	@Autowired
	UserService userservice;
	 @RequestMapping(value = "/user/all", method = RequestMethod.GET)
	 public @ResponseBody List<User> listAllUsers() {
		 User u=new User();
		 u.setId(1);
		 
		 List<User> i=new ArrayList<User>();
		 i.add(u);
		 return i;
	 }
	 
	 
	 @RequestMapping(value = "/user/save", method = RequestMethod.POST)
	 public @ResponseBody User save(@RequestBody User u) {
		 userservice.save(u);
		 return u;
	 }

	 
	 @Autowired
	 RecommendationService recommendationService;
	 @RequestMapping(value = "/recommend/all", method = RequestMethod.GET)
	 public @ResponseBody FraudUsers listAllRecommentaion(){
		 List<User> a= userservice.getAllUsers();
		 FraudUsers o=new FraudUsers();
		 o.setTotalusers(a);		 
		 return o;
		 
	 }
}
