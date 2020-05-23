package com.techlabs.templatepatterntest.test;

import com.techlabs.templatepatterntest.*;

public class Test {
	public static void main(String[] args) {
		SavingAccount account1 = new SavingAccount(2000);
		account1.withdraw(10000);
		account1.withdraw(100);
		account1.deposit(10000);
		account1.deposit(-10000);
		System.out.println();
		CreditAccount account2 = new CreditAccount(2000);
		account2.withdraw(10000);
		account2.withdraw(100);
		account2.deposit(10000);
		account2.deposit(-10000);
	}
}
