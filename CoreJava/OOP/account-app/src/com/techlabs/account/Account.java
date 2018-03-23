package com.techlabs.account;

public class Account {
	private int accountNo;
	private String name;
	private int balance;

	public Account(int accountNo, String name, int balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	public Account(int accountNo, String name) {
		this(accountNo, name, 3000);
	}

	public void withdraw(int amount) {
		if ((balance - amount) > 500)
			balance = balance - amount;
	}

	public void deposit(int amount) {
		balance = balance + amount;
	}

	public Account whoIsRich(Account secondAccount) {
		if (balance < secondAccount.balance)
			return secondAccount;
		
		return this;
	}

	public int getBalance() {
		return balance;
	}

	public int getAccountNo() {
		return accountNo;

	}

	public String getName() {
		return name;

	}

}
