package com.techlabs.deserializationtest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationTest {
	public static void main(String[] args) {
		String filename = "acc101.ser";
		Account account1 = deserialize(filename);
		printInfo(account1);
	}

	private static void printInfo(Account account) {
		System.out.println(account.getId());
		System.out.println(account.getName());
		System.out.println(account.getBalance());
	}

	private static Account deserialize(String filename) {
		try {
			Account acc=null;
			FileInputStream file=new FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(file);
			acc=(Account) in.readObject();
			in.close();
			file.close();
			return acc;
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
