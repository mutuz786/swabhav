package com.techlab.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlab.entity.User;
import com.techlab.repository.UserRepository;

@Service("authorizesvc")
public class AuthorizationService {
	@Autowired
	private UserRepository repository;
	private Map<String, String> users;

	private AuthorizationService() {
	}

	public boolean isValid(String username, String password) {
		loadUsers();
		if (password.equals(users.get(username)))
			return true;
		return false;
	}

	private void loadUsers() {
		users = new HashMap<String, String>();
		for (User user : repository.getUsers()) {
			users.put(user.getUsername(), user.getPassword());
		}
	}

	public User getUser(String username) {
		for (User user : repository.getUsers()) {
			if (user.getUsername().equals(username))
				return user;
		}
		return null;
	}
}
