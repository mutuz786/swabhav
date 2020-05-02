package com.techlabs.model;


public class Account {
	private static final double LOWER_LIMIT = 500;
	private int id;
	private String name;
	private double balance;
	private int amount;

	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public void withdraw(int amount) {
		this.amount = amount;
		if (isValid(amount)) {
			balance -= amount;
			System.out.println("Withdraw Successful");
		}
	}

	private boolean isValid(int amount) {
		if (balance - amount < LOWER_LIMIT) {
			throw new InsufficientFundsException(this);
		}
		
		return true;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public int getAmount() {
		return amount;
	}
}
