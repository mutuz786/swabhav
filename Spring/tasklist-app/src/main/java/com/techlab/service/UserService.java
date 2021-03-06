package com.techlab.service;

import java.sql.Blob;
import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlab.entity.User;
import com.techlab.repository.UserRepository;

@Service("usersvc")
public class UserService {
	@Autowired
	private UserRepository repository;

	public List<User> getUsers() {
		return repository.getUsers();
	}

	public void addUser(String firstName, String lastName, String email, String username, String password, Blob img) {
		repository.addUser(firstName, lastName, email, username, password, img);
	}

	public User getUser(String id) {
		return repository.getUser(id);
	}

	public void deleteUser(String id) {
		repository.deleteUser(id);
	}

	public void editUser(String id, String firstName, String lastName, String email, String username, String password,
			Blob img) {
		repository.editUser(id, firstName, lastName, email, username, password, img);
	}

	public void setBlocked(String id, boolean blocked) {
		repository.setblockedStatus(id, blocked);
	}

	public boolean isUsernamePresent(String username) {
		for (User user : repository.getUsers()) {
			if (user.getUsername().equals(username))
				return true;
		}
		return false;
	}

	public Session getSession() {
		return repository.getSession();
	}

}
