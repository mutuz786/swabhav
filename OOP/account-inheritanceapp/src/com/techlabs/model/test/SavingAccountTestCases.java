package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.model.Account;
import com.techlabs.model.SavingAccount;

class SavingAccountTestCases {

	@Test
	void test_depositMethodOn10000Balance_WithInput2000_ReturnBalance12000() {
		Account account=new SavingAccount(101, "murtaza", 10000);
		double expectedBalance=12000;
		account.deposit(2000);
		double actualBalance=account.getBalance();
		assertEquals(expectedBalance, actualBalance);
	}
	@Test
	void test_depositMethodOn10000Balance_WithInputNegative2000_ReturnBalance10000() {
		Account account=new SavingAccount(101, "murtaza", 10000);
		double expectedBalance=10000;
		account.deposit(-2000);
		double actualBalance=account.getBalance();
		assertEquals(expectedBalance, actualBalance);
	}
	@Test
	void test_withdrawMethodOn10000Balance_WithInput2000_ReturnBalance8000() {
		Account account=new SavingAccount(101, "murtaza", 10000);
		double expectedBalance=8000;
		account.withdraw(2000);
		double actualBalance=account.getBalance();
		assertEquals(expectedBalance, actualBalance);
	}
	@Test
	void test_withdrawMethodOn10000Balance_WithInputNegative2000_ReturnBalance10000() {
		Account account=new SavingAccount(101, "murtaza", 10000);
		double expectedBalance=10000;
		account.withdraw(-2000);
		double actualBalance=account.getBalance();
		assertEquals(expectedBalance, actualBalance);
	}
	@Test
	void test_withdrawMethodOn10000Balance_WithInput20000_ReturnBalance10000() {
		Account account=new SavingAccount(101, "murtaza", 10000);
		double expectedBalance=10000;
		account.withdraw(20000);
		double actualBalance=account.getBalance();
		assertEquals(expectedBalance, actualBalance);
	}
}
