package com.techlab.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.model.User;
import com.techlab.service.AuthorizationService;

public class AuthorizationAction extends ActionSupport implements SessionAware, ModelDriven<User> {
	private static final long serialVersionUID = 1L;
	private SessionMap<String, Object> session;
	private User user;
	private String link;

	public String loginDo() {
		if (AuthorizationService.getInstance().isValid(user.getUsername(), user.getPassword())) {
			session.put("user", user);
			link = (String) ActionContext.getContext().getSession().get("link");
			return "success";
		}
		return "error";
	}

	public String logoutDo() {
		session.remove("user");
		return "success";
	}

	public void validateLogin() {
		if (user.getUsername() == "")
			addFieldError("username", "enter username");
		if (user.getPassword() == "")
			addFieldError("password", "enter password");
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>) session;
	}

	@Override
	public User getModel() {
		user = new User();
		return user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}
