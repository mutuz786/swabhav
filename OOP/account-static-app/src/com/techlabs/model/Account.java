package com.techlabs.model;

public class Account {
	private double balance;
	private static int MINIMUM_BALANCE;
	private static int totalNumOfTransaction;
	static {
		MINIMUM_BALANCE = 500;
		totalNumOfTransaction = 0;
	}

	public Account(int amount) {
		balance = amount;
	}

	public void deposit(int amount) {
		balance += amount;
		addCount();
	}

	public void withdraw(int amount) {
		if (balance - amount < MINIMUM_BALANCE)
			balance -= amount;
		addCount();
	}

	private void addCount() {
		totalNumOfTransaction++;
	}

	public static void setMinBal(int amount) {
		MINIMUM_BALANCE = amount;
	}

	public int getMinBal() {
		return MINIMUM_BALANCE;
	}
	
	public static int getCount() {
		return totalNumOfTransaction;
	}

}
