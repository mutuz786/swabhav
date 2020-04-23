package com.techlabs.userdefinedexceptiontest.checkedexceptiontest;

public class LowBalanceException extends Exception {
	private static final long serialVersionUID = 1L;

	public LowBalanceException() {
		super("Low Balance");
	}
}
