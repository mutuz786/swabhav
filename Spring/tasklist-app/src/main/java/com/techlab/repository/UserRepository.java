package com.techlab.repository;

import java.util.List;
import java.util.UUID;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.techlab.entity.User;

@Repository
@Transactional
public class UserRepository {
	@Autowired
	private SessionFactory fact;

	@SuppressWarnings("unchecked")
	public List<User> getUsers() {
		List<User> users = fact.getCurrentSession().createQuery("from User").list();
		return users;
	}

	public User getUser(String id) {
		for (User user : getUsers()) {
			if (user.getId().equals(id))
				return user;
		}
		return null;
	}

	public void addUser(String firstName, String lastName, String email, String username, String password) {
		User user = new User(UUID.randomUUID().toString(), firstName, lastName, email, username, password);
		fact.getCurrentSession().save(user);
	}

	public void deleteUser(String id) {
		User user = getUser(id);
		fact.getCurrentSession().delete(user);
	}

	public void editUser(String id, String firstName, String lastName, String email, String username, String password) {
		User user = getUser(id);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setUsername(username);
		user.setPassword(password);
		fact.getCurrentSession().update(user);
	}

	public void setblockedStatus(String id, boolean blocked) {
		User user = getUser(id);
		user.setBlocked(blocked);
		fact.getCurrentSession().update(user);
	}
}
