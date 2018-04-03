package com.techlabs.banking;

public class CurrentAccount extends Account {
	static private int OVERDRAFT = 10000;

	public CurrentAccount(int accountNo, String name, int balance) {
		super(accountNo, name, balance);
		
	}

	@Override
	public void withdraw(int amount) {
		if (((balance <= amount) && amount <= OVERDRAFT)
				|| (amount-balance ) <= OVERDRAFT) {
			balance = balance - amount;
		}
		else
		balance=0;

	}
}
