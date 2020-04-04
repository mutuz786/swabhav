package com.techlabs.deserializeanarraytest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import com.techlabs.account.*;

public class DeserializeAnArrayTest {
	public static void main(String[] args) {
		String filename = "accounts.ser";

		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			Account[] accounts=(Account[]) in.readObject();
			in.close();
			file.close();
			printInfo(accounts);
		} catch (IOException e) {
			System.out.println("IOException Found");
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException found");
		}
	}

	private static void printInfo(Account[] accounts) {
		for (int i = 0; i < accounts.length; i++) {
			System.out.println(accounts[i].getId());
			System.out.println(accounts[i].getName());
			System.out.println(accounts[i].getBalance());
			System.out.println();
		}
	}

}
