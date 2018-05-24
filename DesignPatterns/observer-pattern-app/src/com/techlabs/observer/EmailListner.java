package com.techlabs.observer;

public class EmailListner  implements IAccountListner{

	@Override
	public void balanceChanged(Account account) {
		System.out.println("Balance of account holder " + account.getName() +"is : "+ account.getBalance()
				+ " email sent to customer");
	}

}
