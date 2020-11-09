package com.techlab.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import com.techlab.service.LoginService;

public class LoginAction implements SessionAware {
	private String username;
	private String password;
	private String message;
	private SessionMap<String, Object> session;

	public String execute() throws Exception {
		return "success";
	}

	public String login() {
		if (username.equals("")) {
			message = "*username required";
			return "input";
		}
		if (password.equals("")) {
			message = "*password required";
			return "input";
		}
		if (LoginService.getInstance().isValidUser(username, password)) {
			session.put("login", true);
			return "success";
		}
		return "error";
	}

	public String logout() {
		session.put("login", false);
		return "success";
	}

	public String getMessage() {
		return message;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>) session;
	}
}
