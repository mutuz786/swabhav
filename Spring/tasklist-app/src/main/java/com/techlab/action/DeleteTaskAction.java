package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlab.service.TaskService;

public class DeleteTaskAction implements Action {
	@Autowired
	private TaskService service;
	private String id;

	@Override
	public String execute() throws Exception {
		service.deleteTask(id);
		return Action.SUCCESS;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
