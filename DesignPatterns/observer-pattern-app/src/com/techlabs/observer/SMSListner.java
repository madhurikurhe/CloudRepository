package com.techlabs.observer;

public class SMSListner implements IAccountListner {

	@Override
	public void balanceChanged(Account account) {
		System.out.println("Balance of account holder " + account.getName() +"is :" +account.getBalance()
				+ " SMS sent to customer");
	}

}

