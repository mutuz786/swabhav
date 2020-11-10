package com.techlab.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class JSONAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private List<User> users;;

	@Override
	public String execute() throws Exception {
		users = new ArrayList<User>();
		users.add(new User(1, "murtaza", 23, "khilawala62@gmail.com"));
		users.add(new User(2, "soham", 32, "soham@gmail.com"));
		users.add(new User(3, "rahul", 12, "rahul@gmail.com"));
		return "success";
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
