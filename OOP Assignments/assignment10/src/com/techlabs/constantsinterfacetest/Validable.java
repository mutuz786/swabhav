package com.techlabs.constantsinterfacetest;

public interface Validable {
	static final int MIN_WITHDRAW = 0;
	
	abstract boolean isValidWithdraw(int amount);
}
