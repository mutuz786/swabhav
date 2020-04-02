package com.techlabs.deserializeanarraytest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import com.techlabs.deserializationtest.Account;

public class DeserializeAnArrayTest {
	public static void main(String[] args) {
		String filename = "accounts.ser";

		try {
			FileInputStream file=new FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(file);
			Object object=in.readObject();
			ArrayList<Account> accounts=(ArrayList<Account>) object;
			in.close();
			file.close();
			for(int i=0;i<accounts.size();i++) {
				System.out.println(accounts.get(i).getId());
				System.out.println(accounts.get(i).getName());
				System.out.println(accounts.get(i).getBalance());
			}
		}
		catch(IOException e) {
			System.out.println("IOException Found");
		}
		catch(ClassNotFoundException e) {
			System.out.println("ClassNotFoundException found");
		}
	}

}
