package com.techlabs.model.test;

import com.techlabs.model.Account;

public class AccountTest1 {
	public static void main(String[] args) {
		Account a1 = new Account(1500);
		Account a2 = new Account(3500);
		Account a3 = new Account(4500);
		a1.deposit(100);
		a2.withdraw(200);
		a3.deposit(280);
		a2.deposit(300);
		a3.withdraw(300);
		System.out.println(Account.getCount());
	}
}
