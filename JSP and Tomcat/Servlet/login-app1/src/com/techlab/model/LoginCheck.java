package com.techlab.model;

import java.util.ArrayList;

public class LoginCheck {
	private static String[] murtaza = { "murtaza", "mumumu" };
	private static String[] rahul = { "rahul", "rarara" };
	private static String[] sagar = { "sagar", "sasasa" };
	private static String[] gaurav = { "gaurav", "gagaga" };
	private static ArrayList<String[]> accounts = new ArrayList<String[]>() {
		{
			add(murtaza);
			add(rahul);
			add(sagar);
			add(gaurav);
		}
	};

	public static boolean validate(String uname, String pword) {
		for (String[] account : accounts) {
			if (uname.equals(account[0]) && pword.equals(account[1])) {
				return true;
			}
		}
		return false;
	}

}
