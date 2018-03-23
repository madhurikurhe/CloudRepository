package com.techlabs.account2;

public class Account {
	private int balance;
	private String name;

	public Account(int balance, String name) {
		this.balance = balance;
		this.name = name;
	}

	public Account whoIsrich(Account acc2) {
		if (acc2.balance > balance)
			return acc2;
		else
		return  new Account(this);

	}

	public int getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}
}
