package com.techlabs.banking.test;

import com.techlabs.banking.SavingAccount;

public class SavingTest {
	public static void main(String args[]) {
		SavingAccount saving = new SavingAccount(1000, "Madhu", 8000);
		saving.deposit(4000);
		System.out.println("Balance after deposit:" + saving.getBalance());
		saving.withdraw(2000);

		if (saving.getBalance() != 0)
			System.out.println("Balance after withdrawal:"
					+ saving.getBalance());
		else
			System.out.println("Insufficient Balance");
	}
}
