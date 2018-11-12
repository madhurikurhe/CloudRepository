package com.techlabs.test;

import com.techlabs.sample.bank.model.AccountService;
import com.techlabs.sample.bank.repository.UserDB;

public class TestAdmin {
	public static void main(String[] args) {
		UserDB user=new UserDB();
		boolean status=user.checkAdmin("admin", "admin");
		System.out.println(status);
		
		AccountService acc=new AccountService();
		boolean status1=acc.checkUser("madhu", "madhu");
		System.out.println(status1);
	}
}
