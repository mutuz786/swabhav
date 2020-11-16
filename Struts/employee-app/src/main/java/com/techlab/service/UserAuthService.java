package com.techlab.service;

import java.util.HashMap;
import java.util.Map;

public class UserAuthService {
	private static UserAuthService uas;
	private Map<String, String> users;

	private UserAuthService() {
		users = new HashMap<String, String>();
		users.put("murtaza", "murtaza");
		users.put("admin", "admin");
	}

	public static UserAuthService getInstance() {
		if (uas == null)
			uas = new UserAuthService();
		return uas;
	}

	public boolean isValid(String username, String password) {
		if (password.equals(users.get(username)))
			return true;
		return false;
	}
}
