package com.techlabs.component;

public enum AccountType {
	SA, CA;

	public Account getAccount() {
		if (this == AccountType.SA) {
			return new SavingAccount();
		}
		if (this == AccountType.CA) {
			return new CreditAccount();
		}
		return null;
	}
}
