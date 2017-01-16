package com.fds.model;

import java.util.List;

import com.fds.dao.model.User;

public class FraudUsers {
	List<User> totalusers;

	public List<User> getTotalusers() {
		return totalusers;
	}

	public void setTotalusers(List<User> totalusers) {
		this.totalusers = totalusers;
	}

}
