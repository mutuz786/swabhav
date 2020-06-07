package com.techlabs.templatepatterntest;

public class SavingAccount implements BankAccountTemplate {
	private double balance;
	private final int LOWER_LIMIT = 1000;

	public SavingAccount(double balance) {
		this.balance = balance;
	}

	@Override
	public void withdraw(double amount) {
		if (balance - amount > LOWER_LIMIT) {
			balance -= amount;
			System.out.println("withdraw success");
			return;
		}
		System.out.println("withdraw failed");
	}

	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("deposit success");
			return;
		}
		System.out.println("deposit failed");
	}

	public double getBalance() {
		return balance;
	}
}
