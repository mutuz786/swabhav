package com.techlabs.userdefinedexceptiontest.uncheckedexceptiontest;

public class LowBalanceException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public LowBalanceException() {
		super("Low Balance");
	}
}
