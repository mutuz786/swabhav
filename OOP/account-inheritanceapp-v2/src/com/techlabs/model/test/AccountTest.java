package com.techlabs.model.test;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import com.techlabs.model.*;

public class AccountTest {
	public static void main(String[] args) throws ParseException, IOException {
		Account[] accounts = new Account[3];
		SavingAccount acc1 = new SavingAccount(100, "murtaza", 1000, "03/01/1997", "04/10/2020");
		CurrentAccount acc2 = new CurrentAccount(101, "Sagar", 5000, "02/12/1998", "04/11/2020");
		SavingAccount acc3 = new SavingAccount(102, "gaurav", 20000, "12/23/1999", "04/03/2020");
		accounts[0] = acc1;
		accounts[1] = acc2;
		accounts[2] = acc3;

		String fileName = "Accounts.csv";
		FileWriter writer = new FileWriter(fileName);
		writer.write("type,accno,name,balance,createdOn,age\n");
		for (Account account : accounts) {
			writer.write(account.getType() + "," + account.getAccno() + "," + account.getName() + ","
					+ account.getBalance() + "," + account.getCreationDate() + "," + account.calculateAge() + "\n");
		}
		writer.close();
	}

	public static Account[] findYoungAccholders(Account[] accHolders) {
		int count = 0;
		Date obj = new Date();
		for (int i = 0; i < accHolders.length; i++) {
			if (accHolders[i].calculateAge() < 40) {
				count++;
			}

		}
		Account[] newAccount = new Account[count];
		count = 0;
		for (int i = 0; i < accHolders.length; i++) {
			if (accHolders[i].calculateAge() < 30) {
				newAccount[count] = accHolders[i];
				count++;
			}

		}

		return newAccount;
	}

}
