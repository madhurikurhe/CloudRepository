package com.techlabs.sample.bank.model;

import java.util.List;

import com.techlabs.sample.bank.repository.BankDB;
import com.techlabs.sample.bank.repository.UserDB;

public class AccountService {
	private UserDB userTool = new UserDB();
	private BankDB bankTool = new BankDB();

	public void addUser(Account acc) {
		userTool.addUser(acc);
	}

	public boolean checkUser(String name, String password) {
		return userTool.checkUser(name, password);
	}

	public double getBalance(String name) {
		return bankTool.getCurrentBalance(name);
	}
	
	public List<Account> getAllCustomer(){
		return userTool.getAllCustomers();
	}
}
