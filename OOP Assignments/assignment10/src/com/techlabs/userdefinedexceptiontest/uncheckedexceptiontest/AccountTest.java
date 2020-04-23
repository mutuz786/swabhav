package com.techlabs.userdefinedexceptiontest.uncheckedexceptiontest;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account(101, "murtaza", 50000);
		printInfo(account);
		account.withdraw(10000);
		printInfo(account);
		account.withdraw(100000);
	}

	private static void printInfo(Account account) {
		System.out
				.println("id:" + account.getId() + "\tname:" + account.getName() + "\tbalance:" + account.getBalance());
	}
}
