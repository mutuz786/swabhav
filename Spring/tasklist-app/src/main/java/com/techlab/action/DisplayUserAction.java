package com.techlab.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlab.entity.User;
import com.techlab.service.UserService;

public class DisplayUserAction implements Action {
	private List<User> users;
	@Autowired
	private UserService service;

	@Override
	public String execute() throws Exception {
		users = service.getUsers();
		return "success";
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
