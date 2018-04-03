package com.techlabs.banking;

public class SavingAccount extends Account {

	public SavingAccount(int accountNo, String name, int balance) {
		super(accountNo, name,balance);
	
	}

	@Override
	public void withdraw(int amount) {
		if((balance-amount)>4000)
			balance=balance-amount;
		else
			balance=0;
		
		

	}
	

}
