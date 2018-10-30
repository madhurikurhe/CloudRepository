package com.techlabs.test;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.sample.bank.model.Transaction;
import com.techlabs.sample.bank.repository.BankDB;
import com.techlabs.sample.bank.repository.UserDB;

public class TestDB {

	public static void main(String[] args) throws ClassNotFoundException {
		List<Transaction> l = new ArrayList<Transaction>();
		UserDB ud = new UserDB();
		BankDB bd = new BankDB();
		
		System.out.println(ud.checkUser("madhu", "madhu"));
		
		l=bd.getTransactions("madhu");
		System.out.println(l.get(0).getName());
	}
}