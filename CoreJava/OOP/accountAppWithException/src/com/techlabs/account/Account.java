package com.techlabs.account;

public class Account {
	private int accountNo;
	private String name;
	private int balance;
	private String message;
	private static int numberOfAccount = 0;

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

	public void withdraw(int amount) {

		if ((balance - amount) < 500) {
			balance = balance - amount;
		}

		throw new InsufficientFundsException(Account.this);
	}

	public int noOfAccount() {
		return numberOfAccount;
	}

	public static int headCount() {
		return numberOfAccount;

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

	public String getMessage() {
		return message;
	}

	public int getAccountNo() {
		return accountNo;

	}

	public String getName() {
		return name;

	}

	public boolean equals(Object acc2) {
		if (acc2 instanceof Account) {
			Account a = (Account) acc2;
			return (getAccountNo() == a.getAccountNo()
					&& getBalance() == a.getBalance() && getName() == a
						.getName());
		}
		return false;

	}

	public String toString() {

		return "\nAccount No:" + accountNo + " Name: " + name + " Balance: "
				+ balance + super.toString();
	}

}
