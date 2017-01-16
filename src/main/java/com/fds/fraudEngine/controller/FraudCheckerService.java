package com.fds.fraudEngine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fds.mobile.service.FraudService;
@Service

public class FraudCheckerService {
	@Autowired
	FraudService fraudService;
	
	public boolean checkFraud(double amount){
		if(amount<100){
			return true;
		}
		return false;
	}
}
