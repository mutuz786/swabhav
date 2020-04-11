package com.techlabs.model;


public abstract class Account {
	private static final int MAX_DEPOSIT = 100000;
	private static final int MIN_DEPOSIT = 0;
	private int accno;
	private String name;
	protected double balance;

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public abstract void withdraw(int ammount);

	public void deposit(int amount) {
		if (isValidDeposit(amount)) {
			balance += amount;
			System.out.println("Deposit Successful ");
		}
	}

	private boolean isValidDeposit(int amount) {
		if (amount > MIN_DEPOSIT || amount < MAX_DEPOSIT)
			return true;
		return false;
	}

	public int getAccno() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
}
