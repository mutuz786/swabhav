package com.techlabs.model;

public class Account {
	private int id;
	private String name;
	private double balance;
	private static int MINIMUM_BALANCE;
	private static int totalNumOfTransaction;
	static {
		MINIMUM_BALANCE = 500;
		totalNumOfTransaction = 0;
	}

	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
		addCount();
	}

	public void withdraw(double amount) {
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

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return super.toString() + attributes();
	}

	private String attributes() {
		return "\nID:" + id + "\nName:" + name + "\nBalance:" + balance;
	}

	public boolean equals(Account account) {
		return (this.attributes().equalsIgnoreCase(account.attributes()));
	}

}
