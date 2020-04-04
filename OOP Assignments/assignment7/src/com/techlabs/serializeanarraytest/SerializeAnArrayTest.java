package com.techlabs.serializeanarraytest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import com.techlabs.account.*;

public class SerializeAnArrayTest {
	public static void main(String[] args) {
		Account[] accounts=new Account[3];
		accounts[0]=new Account(101, "Murtaza", 50000);
		accounts[1]=new Account(102, "Salman", 60000);
		accounts[2]=new Account(103, "Sagar", 40000);
		serialize(accounts);
	}

	private static void serialize(Account[] accounts) {
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
