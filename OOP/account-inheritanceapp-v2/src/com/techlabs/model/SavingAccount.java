package com.techlabs.model;

import java.text.ParseException;

public class SavingAccount extends Account {

	private static final double MIN_BALANCE = 1000;
	private static final int MIN_WITHDRAW = 0;

	public SavingAccount(int accno, String name, double balance,String dateOfBirth,String creationDate) throws ParseException {
		super(accno, name, balance,dateOfBirth, creationDate);
	}

	@Override
	public void withdraw(int amount) {
		if (isValidWithdraw(amount)) {
			System.out.println("Withdraw Successful");
			balance -= amount;
		}
	}

	private boolean isValidWithdraw(int amount) {
		if (balance - amount > MIN_BALANCE && amount > MIN_WITHDRAW ) {
			return true;
		}
		System.out.println("Insufficient Balance");
		return false;
	}

	@Override
	protected String getAccountType() {
		return "saving";
	}
}
