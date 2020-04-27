package com.techlabs.model;

public class Account {
	private static final double LOWER_LIMIT = 500;
	private int id;
	private String name;
	private double balance;
	
	public Account(int id,String name,double balance) {
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	
	public void withdraw(int amount) {
		if(isValid(amount)) {
			
		}
	}

	private boolean isValid(int amount) {
		if(amount<0)
			throw new RuntimeException("Cant Withdraw Negative Number");
		if(balance-amount<LOWER_LIMIT)
			throw new RuntimeException("Insufficient Balance");
		return true;
	}
}
