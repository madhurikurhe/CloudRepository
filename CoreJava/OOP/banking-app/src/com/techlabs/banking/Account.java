package com.techlabs.banking;

public abstract class Account {
	private int accountNo;
	private String name;
	protected int balance;
	private static int numberOfAccount = 0;

	public abstract void withdraw(int amount);

	public Account(int accountNo, String name, int balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;

		numberOfAccount++;
	}

	public Account(int accountNo, String name) {

		this(accountNo, name, 3000);
	}

	public int noOfAccount() {
		return numberOfAccount;
	}

	public void deposit(int amount) {
		balance = balance + amount;
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

	public String toString() {

		return "\nAccount No:" + accountNo + " Name: " + name + " Balance: "
				+ balance + super.toString();
	}

}
