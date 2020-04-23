package com.techlabs.userdefinedexceptiontest.checkedexceptiontest;

public class Account {
	private int id;
	private String name;
	private double balance;

	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public void withdraw(double amount) throws LowBalanceException {
		if (amount > balance)
			throw new LowBalanceException();
		else
			balance -= amount;
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
}
