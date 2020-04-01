package com.techlabs.serializationtest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {
	public static void main(String[] args) {
		Account account1 = new Account(101, "Murtaza", 25000);
		serialize(account1);
	}

	private static void serialize(Account account) {
		String filename = "acc" + account.getId() + ".ser";
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(account);
			out.close();
			file.close();
			System.out.println("Serialization successful");
		} catch (IOException e) {
			System.out.println("IOException found");
		}
	}
}
