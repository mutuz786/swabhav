package com.techlab.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.entity.User;
import com.techlab.service.AuthorizationService;
import com.techlab.viewmodel.UserViewModel;

public class AuthorizationAction extends ActionSupport implements SessionAware, ModelDriven<UserViewModel> {
	private static final long serialVersionUID = 1L;
	private SessionMap<String, Object> session;
	@Autowired
	private AuthorizationService authorizationService;
	private UserViewModel user;
	private String link;

	@Override
	public String execute() throws Exception {
		return Action.SUCCESS;
	}

	public String loginDo() {
		if (authorizationService.isValid(user.getUsername(), user.getPassword())) {
			User newUser = authorizationService.getUser(user.getUsername());
			session.put("user", newUser);
			session.put("loginUser", newUser);
			session.put("isAdmin", user.isAdmin());
			link = (String) ActionContext.getContext().getSession().get("link");
			if (link == "home" || link == null)
				link = "user";
			return "success";
		}
		addFieldError("username", "wrong username and password");
		return "error";
	}

	public String logoutDo() {
		session.remove("loginUser");
		session.remove("user");
		session.remove("task");
		session.remove("isAdmin");
		ActionContext.getContext().getSession().put("link", "home");
		return "success";
	}

	public void validateLoginDo() {
		if (user.getUsername() == "")
			addFieldError("username", "enter username");
		if (user.getPassword() == "")
			addFieldError("password", "enter password");
		if (authorizationService.isBlocked(user.getUsername()))
			addActionError("Sorry User You Have been blocked by the admin");
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>) session;
	}

	@Override
	public UserViewModel getModel() {
		user = new UserViewModel();
		return user;
	}

	public UserViewModel getUser() {
		return user;
	}

	public void setUser(UserViewModel user) {
		this.user = user;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}
