package com.techlabs.sample.bank.repository;

import java.util.List;

import com.techlabs.sample.bank.model.Account;

public class TestAllCustomer {
	public static void main(String[] args) throws ClassNotFoundException{
		UserDB user = new UserDB();
		List<Account> accounts=user.getAllCustomers();
		for(Account a:accounts){
			System.out.println("Name:"+a.getName());
			System.out.println("Balance:"+a.getBalance());
		}
	}
}
