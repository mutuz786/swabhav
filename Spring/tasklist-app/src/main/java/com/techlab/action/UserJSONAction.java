package com.techlab.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.entity.User;
import com.techlab.service.UserService;

public class UserJSONAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	@Autowired
	private UserService uService;
	private List<User> users;

	@Override
	public String execute() throws Exception {
		users = uService.getUsers();
		return "success";
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
