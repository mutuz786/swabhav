package com.techlab.service;

import java.util.HashMap;
import java.util.Map;

public class LoginService {
	private static LoginService ls;
	private Map<String, String> users;

	private LoginService() {
		users = new HashMap<String, String>();
		users.put("murtaza", "murtaza");
		users.put("admin", "admin");
		users.put("soham", "soham");
	}

	public static LoginService getInstance() {
		if (ls == null)
			ls = new LoginService();
		return ls;
	}

	public boolean isValid(String username, String password) {
		if (users.containsKey(username)) {
			if (users.get(username).equals(password))
				return true;
		}
		return false;
	}
}
