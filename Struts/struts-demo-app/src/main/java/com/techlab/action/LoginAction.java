package com.techlab.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ModelDriven;
import com.techlab.model.User;
import com.techlab.service.LoginService;

public class LoginAction implements SessionAware, ModelDriven<User> {
	private String message;
	private SessionMap<String, Object> session;
	private User userObject;

	public String execute() throws Exception {
		return "success";
	}

	public String login() {
		System.out.println(userObject);
		if (userObject.getUsername().equals("")) {
			message = "*username required";
			return "input";
		}
		if (userObject.getPassword().equals("")) {
			message = "*password required";
			return "input";
		}
		if (LoginService.getInstance().isValidUser(userObject.getUsername(), userObject.getPassword())) {
			session.put("user", userObject);
			return "success";
		}
		return "error";
	}

	public String logout() {
		session.remove("user");
		return "success";
	}

	public String getMessage() {
		return message;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>) session;
	}

	@Override
	public User getModel() {
		userObject = new User();
		return userObject;
	}

	public User getUser() {
		return userObject;
	}

	public void setUser(User user) {
		this.userObject = user;
	}
}
