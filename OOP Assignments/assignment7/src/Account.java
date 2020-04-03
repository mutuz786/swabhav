

import java.io.*;

public class Account implements Serializable{
	private static final long serialVersionUID = 1L;
	public String name = "";
	public int id = 0;
	public float balance = 0f;

	public  Account(int id, String name, float balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public float getBalance() {
		return balance;
	}
}