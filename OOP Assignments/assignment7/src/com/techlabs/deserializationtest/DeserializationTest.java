package com.techlabs.deserializationtest;

import java.io.*;
import com.techlabs.account.*;

public class DeserializationTest {
	public static void main(String[] args) {
		String filename = "acc101.ser";
		deserialize(filename);
	}

	private static void deserialize(String filename) {
		try {
			Account account=null;
			FileInputStream file=new FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(file);
			account=(Account) in.readObject();
			System.out.println(account.getId());
			System.out.println(account.getName());
			System.out.println(account.getBalance());
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
