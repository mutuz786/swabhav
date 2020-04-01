package com.techlabs.deserializeanarraytest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.techlabs.deserializationtest.Account;

public class DeserializeAnArrayTest {
	public static void main(String[] args) {
		String filename = "accounts.ser";
		ArrayList<Account> accounts = deserialize(filename);
		for(Account account:accounts)
			printInfo(account);
	}

	private static void printInfo(Account account) {
		System.out.println(account.getId());
		System.out.println(account.getName());
		System.out.println(account.getBalance());
	}

	private static ArrayList<Account> deserialize(String filename) {
		try {
			FileInputStream file=new FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(file);
			ArrayList<Account> accounts=(ArrayList<Account>) in.readObject();
			in.close();
			file.close();
			return accounts;
		}
		catch(IOException e) {
			System.out.println("IOException Found");
		}
		catch(ClassNotFoundException e) {
			System.out.println("ClassNotFoundException found");
		}
		return null;
	}

}
