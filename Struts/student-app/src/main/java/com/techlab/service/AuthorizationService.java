package com.techlab.service;

import java.util.HashMap;
import java.util.Map;

public class AuthorizationService {
	private static AuthorizationService as;
	private Map<String, String> users;

	private AuthorizationService() {
		users = new HashMap<String, String>();
		users.put("murtaza", "murtaza");
		users.put("admin", "admin");
	}

	public static AuthorizationService getInstance() {
		if (as == null)
			as = new AuthorizationService();
		return as;
	}

	public boolean isValid(String username, String password) {
		if (password.equals(users.get(username)))
			return true;
		return false;
	}
}
