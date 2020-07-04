package com.techlabs.subscriber;

import com.techlabs.publisher.Account;
import com.techlabs.publisher.IBalanceObserver;

public class EmailObserver implements IBalanceObserver {

	@Override
	public void update(Account account) {
		System.out.println("balance changed to " + account.getBalance() + " for " + account.getName());
	}

}
