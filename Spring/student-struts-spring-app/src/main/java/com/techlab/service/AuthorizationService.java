package com.techlab.service;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service("authorizesvc")
public class AuthorizationService {
	private Map<String, String> users;

	private AuthorizationService() {
		users = new HashMap<String, String>();
		users.put("murtaza", "murtaza");
		users.put("admin", "admin");
	}

	public boolean isValid(String username, String password) {
		if (password.equals(users.get(username)))
			return true;
		return false;
	}

}
