package com.techlabs.banking.test;

import com.techlabs.banking.CurrentAccount;

public class CurrentTest {
	public static void main(String args[]) {
		CurrentAccount current = new CurrentAccount(1000, "Madhu", 8000);
	    current.deposit(4000);
		System.out.println("Balance in your account:" + current.getBalance());

		current.withdraw(22000);

		if (current.getBalance() != 0)
			System.out.println("Balance in your account:" + current.getBalance());
		else
			System.out.println("Beyond overdraft limit");

	}
}
