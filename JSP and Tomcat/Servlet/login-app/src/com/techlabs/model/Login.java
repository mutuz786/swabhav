package com.techlabs.model;

public class Login {
	private static String uname = "admin";
	private static String pword = "admin";

	public static boolean isValid(String username, String password) {
		if (uname.equals(username) && pword.equals(password))
			return true;
		return false;
	}

}
