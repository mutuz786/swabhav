package com.techlab.model;

import java.util.ArrayList;

public class LoginCheck {
	private static String[] murtaza = { "murtaza", "mumumu" };
	private static String[] rahul = { "rahul", "rarara" };
	private static String[] sagar = { "sagar", "sasasa" };
	private static String[] gaurav = { "gaurav", "gagaga" };
	private static ArrayList<String[]> admin = new ArrayList<String[]>() {
		{
			add(murtaza);
		}
	};
	private static ArrayList<String[]> guest = new ArrayList<String[]>() {
		{
			add(rahul);
			add(sagar);
			add(gaurav);
		}
	};

	public static int validate(String uname, String pword) {
		for (String[] account : admin) {
			if (uname.equals(account[0]) && pword.equals(account[1])) {
				return 0;
			}
		}
		for (String[] account : guest) {
			if (uname.equals(account[0]) && pword.equals(account[1])) {
				return 1;
			}
		}
		return -1;
	}

}
