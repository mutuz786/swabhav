package com.techlabs.client;

import com.techlabs.component.*;

public class Test {
	public static void main(String[] args) {
		AccountFactory factory = AccountFactory.getInstance();
		Account acc = factory.make(AccountType.SA);
		acc.setAccno(101);
		acc.setName("abc");
		acc.deposit(10000);
		acc.withdraw(100000);
		acc.withdraw(8000);
		printInfo(acc);

		Account acc2 = factory.make(AccountType.CA);
		acc2.setAccno(102);
		acc2.setName("xyz");
		acc2.deposit(10000);
		acc2.withdraw(10000);
		printInfo(acc2);
	}

	private static void printInfo(Account acc) {
		System.out.println("Id:" + acc.getId() + "\nName:" + acc.getName() + "\nBalance:" + acc.getBalance());
	}
}
