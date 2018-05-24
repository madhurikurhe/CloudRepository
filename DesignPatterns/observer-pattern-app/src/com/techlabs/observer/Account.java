package com.techlabs.observer;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int accountNo;
	private String name;
	private int balance;
	private List<IAccountListner> listner;
	private IAccountListner acc1;
	public Account(int accountNo, String name, int balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
		listner=new ArrayList<IAccountListner>();
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int amount){
		this.balance=amount+this.balance;
		
		IAccountListner acc1;
		acc1=new SMSListner();
		acc1.balanceChanged(this);
		
		acc1=new EmailListner();
		acc1.balanceChanged(this);
	}

	public void withdraw(int amount){
		this.balance=this.balance-amount;
		IAccountListner acc1;
		acc1=new SMSListner();
		acc1.balanceChanged(this);
		
		acc1=new EmailListner();
		acc1.balanceChanged(this);
	}


	public void addListner(IAccountListner listner1){
		listner.add(listner1);
	}
	
	
	public void removeListner(IAccountListner listner1){
		listner.remove(listner1);
	}

}
