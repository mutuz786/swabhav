package com.techlab.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlab.entity.User;
import com.techlab.service.TaskService;
import com.techlab.service.UserService;

public class DisplayUserAction implements Action, SessionAware {
	private List<User> users;
	@Autowired
	private UserService uService;
	@Autowired
	private TaskService tService;
	private SessionMap<String, Object> session;
	private List<Integer> lengths;

	@Override
	public String execute() throws Exception {
		users = new ArrayList<User>();
		if ((boolean) session.get("isAdmin"))
			users = uService.getUsers();
		else
			users.add((User) session.get("user"));
		lengths = new ArrayList<Integer>();
		for (User tempUser : users) {
			lengths.add(tService.getTasks(tempUser.getId()).size());
		}
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

	public List<Integer> getLengths() {
		return lengths;
	}

	public void setLengths(List<Integer> lengths) {
		this.lengths = lengths;
	}

}
