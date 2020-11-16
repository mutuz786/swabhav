package com.techlab.action;

import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.model.User;
import com.techlab.service.UserAuthService;

public class AuthAction extends ActionSupport implements ModelDriven<User>, SessionAware {
	private static final long serialVersionUID = 1L;
	private SessionMap<String, Object> session;
	private User user;
	private String link;

	public String loginDo() throws Exception {
		if (UserAuthService.getInstance().isValid(user.getUsername(), user.getPassword())) {
			session.put("user", user);
			link = (String) session.get("link");
			return "success";
		}
		return "error";
	}

	public String logoutDo() {
		session.remove("user");
		return "success";
	}

	public void validateLoginDo() {
		if (user.getUsername() == "")
			addFieldError("username", "*enter username");
		if (user.getPassword() == "")
			addFieldError("password", "*enter password");
	}

	@Override
	public User getModel() {
		user = new User();
		return user;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>) session;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}
