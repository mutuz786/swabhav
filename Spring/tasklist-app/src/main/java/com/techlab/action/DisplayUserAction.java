package com.techlab.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlab.entity.User;
import com.techlab.service.UserService;

public class DisplayUserAction implements Action, SessionAware {
	private List<User> users;
	@Autowired
	private UserService service;
	private SessionMap<String, Object> session;

	@Override
	public String execute() throws Exception {
		users = new ArrayList<User>();
		if ((boolean) session.get("isAdmin"))
			users = service.getUsers();
		else
			users.add((User) session.get("user"));
		session.remove("task");
		return "success";
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public SessionMap<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>) session;
	}

}
