package com.fds.mobile.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;
@Service

//import org.springframework.stereotype.Component;  //Service and Component does same work
//@Component
public class FraudService {
	public int getFraudAmount(){
		Scanner inputAmount = new Scanner(System.in);
		System.out.println("Enter Amount: ");
		return inputAmount.nextInt();
		//		return 80;
	}
	
	public boolean checkFraud(double amount){
		if(amount<100){
			return true;
		}
		return false;
	}
}
