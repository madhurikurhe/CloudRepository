package com.techlabs.sample.bank.model;

import java.util.List;

import com.techlabs.sample.bank.repository.BankDB;
import com.techlabs.sample.bank.repository.UserDB;

public class AccountService {
	private UserDB userService = new UserDB();
	private BankDB bankService = new BankDB();

	public void addUser(Account acc) {
		userService.addUser(acc);
	}

	public boolean checkUser(String name, String password) {
		if (name.equals("admin")) {
			boolean s1 = userService.checkAdmin(name, password);
			System.out.println(s1);
			return s1;
		} else {
			boolean s1 = userService.checkUser(name, password);
			System.out.println(s1);
			return s1;
		}
	}

	public double getBalance(String name) {
		return bankService.getCurrentBalance(name);
	}

	public List<Account> getAllCustomer(String name) {
		return userService.getAllCustomers(name);
	}

	public List<Account> getAllAccountHolders() {
		return userService.getAllAccountHolders();
	}

}
