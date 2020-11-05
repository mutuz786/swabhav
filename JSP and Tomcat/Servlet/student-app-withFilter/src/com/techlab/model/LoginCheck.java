package com.techlab.model;

import javax.servlet.http.HttpServletRequest;

public class LoginCheck {
	private static String[] murtaza = { "murtaza", "mumumu" };

	public static boolean validate(String uname, String pword) {
		if (uname.equals(murtaza[0]) && pword.equals(murtaza[1])) {
			return true;
		}
		return false;
	}

	public static boolean isAdmin(HttpServletRequest request) {
		String accountType = (String) request.getAttribute("accountType");
		if (accountType == null) {
			return false;
		} else {
			if (accountType == "admin") {
				return true;
			}
		}
		return false;
	}
}