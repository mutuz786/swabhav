package com.techlabs.model;


public class SavingAccount extends Account {

	private static final double MIN_BALANCE = 1000;
	private static final int MIN_WITHDRAW = 0;

	public SavingAccount(int accno, String name, double balance) {
		super(accno, name, balance);
	}

	@Override
	public void withdraw(int amount) {
		if (isValidWithdraw(amount)) {
			System.out.println("Withdraw Successful");
			balance -= amount;
		}
	}

	private boolean isValidWithdraw(int amount) {
		if (balance - amount > MIN_BALANCE && amount > MIN_WITHDRAW) {
			return true;
		}
		System.out.println("Insufficient Balance");
		return false;
	}
}
