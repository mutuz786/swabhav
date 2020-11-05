package com.techlab.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginCheck {
	private static String[] murtaza = { "murtaza", "mumumu" };

	public static boolean validate(String uname, String pword) {
		if (uname.equals(murtaza[0]) && pword.equals(murtaza[1])) {
			return true;
		}
		return false;
	}

	public static boolean isAdmin(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if (session.getAttribute("accountType") == null) {
			return false;
		} else {
			if (session.getAttribute("accountType") == "admin") {
				return true;
			}
		}
		return false;
	}
}