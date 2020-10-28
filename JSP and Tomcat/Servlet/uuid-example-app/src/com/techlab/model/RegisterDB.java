package com.techlab.model;

import java.util.UUID;

public class RegisterDB {
	private static UUID id = null;
	private static String[] data = null;

	public static String[] getData() {
		return data;
	}

	public static void add(String fname, String lname, String address, String email) {
		id = UUID.randomUUID();
		String[] entry = { id.toString(), fname, lname, address, email };
		data = entry;
	}
}
