package com.techlab.service;

import java.util.HashMap;
import java.util.Map;

public class LoginService {
	private Map<String, String> users = null;
	private static LoginService ls = null;

	private LoginService() {
		System.out.println("in service constructor");
		users = new HashMap<String, String>();
		loadUser();
	}

	public static LoginService getInstance() {
		if (ls == null)
			ls = new LoginService();
		return ls;
	}

	private void loadUser() {
		users.put("admin", "admin");
		users.put("murtaza", "murtaza");
	}

	public boolean isValidUser(String username, String password) {
		if (users.containsKey(username)) {
			if (users.get(username).equals(password))
				return true;
		}
		System.out.println("false");
		return false;
	}
}
