package com.techlabs.model;

public class InsufficientFundsException extends RuntimeException {
	
	public InsufficientFundsException(Account account) {
		super("The account holder " + account.getName() + " with id " + account.getId() + " and balance of "
				+ account.getBalance() + " tried to withdraw the amount of " + account.getAmount()
				+ " but couldnt suceed because the account is underbalance");
	}
}
