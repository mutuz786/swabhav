package com.techlabs.component;

public class AccountFactory {
	private static AccountFactory accountFactory;
	private AccountFactory() {
	}
	public static AccountFactory getInstance() {
		if (accountFactory == null) {
			accountFactory = new AccountFactory();
		}
		return accountFactory;
	}

	public Account make(AccountType accountType) {
		return accountType.getAccount();
	}
}
