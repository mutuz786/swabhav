package com.techlabs.constantsinterfacetest;

public class CurrentAccount extends Account implements Validable {

	private static final double MIN_BALANCE = -5000;

	public CurrentAccount(int accno, String name, double balance) {
		super(accno, name, balance);
	}

	@Override
	public void withdraw(int amount) {
		if (isValidWithdraw(amount)) {
			System.out.println("Withdraw Successful");
			balance -= amount;
		}
	}

	public boolean isValidWithdraw(int amount) {
		if (balance - amount > MIN_BALANCE && amount > MIN_WITHDRAW) {
			return true;
		}
		System.out.println("Insufficient Balance");
		return false;
	}
}
