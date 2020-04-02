package com.techlabs.deserializationtest;

import java.io.*;

public class DeserializationTest {
	public static void main(String[] args) {
		String filename = "acc101.ser";
		deserialize(filename);
	}

	private static void printInfo(Account account) {
		System.out.println(account.getId());
		System.out.println(account.getName());
		System.out.println(account.getBalance());
	}

	private static void deserialize(String filename) {
		try {
			FileInputStream file=new FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(file);
			Account account=(Account) in.readObject();
			printInfo(account);
			in.close();
			file.close();
			

		}
		catch(IOException e) {
			System.out.println("IOException Found");
		}
		catch(ClassNotFoundException e) {
			System.out.println("ClassNotFoundException found");
		}
	}
}
