package com.techlabs.serializeanarraytest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.techlabs.serializationtest.Account;

public class SerializeAnArrayTest {
	public static void main(String[] args) {
		ArrayList<Account> accounts = new ArrayList<Account>();
		Account account1 = new Account(101, "Murtaza", 25000);
		accounts.add(account1);
		Account account2 = new Account(102, "Salman", 25000);
		accounts.add(account2);
		Account account3 = new Account(103, "Salman", 25000);
		accounts.add(account3);
		serialize(accounts);
	}

	private static void serialize(ArrayList<Account> accounts) {
		String filename = "accounts.ser";
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(accounts);
			out.close();
			file.close();
			System.out.println("Serialization successful");
		} catch (IOException e) {
			System.out.println("IOException found");
		}
	}
}
