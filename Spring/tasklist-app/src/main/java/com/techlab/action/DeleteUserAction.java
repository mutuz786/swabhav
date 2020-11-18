package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlab.service.UserService;

public class DeleteUserAction implements Action {
	@Autowired
	private UserService service;
	private String id;

	@Override
	public String execute() throws Exception {
		service.deleteUser(id);
		return Action.SUCCESS;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
