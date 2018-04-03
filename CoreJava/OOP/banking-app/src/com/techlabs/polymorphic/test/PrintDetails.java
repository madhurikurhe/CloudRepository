package com.techlabs.polymorphic.test;

import com.techlabs.banking.Account;
import com.techlabs.banking.CurrentAccount;
import com.techlabs.banking.SavingAccount;

public class PrintDetails {

	public static void main(String args[]) {
		PrintDetails print = new PrintDetails();
		SavingAccount saving = new SavingAccount(2000, "Trisha", 6000);
		CurrentAccount current = new CurrentAccount(1000, "Prasad", 5000);
		print.printReceipt(saving);
		print.printReceipt(current);

	}

	private void printReceipt(Account a) {
		System.out.println("Account No:" + a.getAccountNo());
		System.out.println("Name:" + a.getName());
		System.out.println("Balance:" + a.getBalance());

	}
}
