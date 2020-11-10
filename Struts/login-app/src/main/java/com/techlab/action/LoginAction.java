package com.techlab.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ModelDriven;
import com.techlab.model.User;
import com.techlab.service.LoginService;

public class LoginAction implements SessionAware, ModelDriven<User> {
	private User user;
	private SessionMap<String, Object> session;

	public String execute() throws Exception {
		return "success";
	}

	@Override
	public User getModel() {
		user = new User();
		return user;
	}

	public String loginDo() {
		if (LoginService.getInstance().isValid(user.getUsername(), user.getPassword())) {
			session.put("user", user);
			return "success";
		}
		return "error";
	}

	public String logoutDo() {
		session.remove("user");
		return "success";
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>) session;
	}

	public User getU() {
		return user;
	}

	public void setU(User u) {
		this.user = u;
	}
}
