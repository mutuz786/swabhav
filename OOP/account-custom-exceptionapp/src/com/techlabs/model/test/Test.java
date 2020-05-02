package com.techlabs.model.test;

import com.techlabs.model.Account;
import com.techlabs.model.InsufficientFundsException;

public class Test {
	public static void main(String [] args) {
		Account account=new Account(101, "Murtaza", 1000);
		try{
			account.withdraw(600);
		}
		catch(InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("end of main");
	}
}
