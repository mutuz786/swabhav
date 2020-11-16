package com.techlab.action;

import com.opensymphony.xwork2.Action;
import com.techlab.service.StudentService;

public class DeleteAction implements Action {
	private String id;

	@Override
	public String execute() throws Exception {
		StudentService.getInstance().deleteStudent(id);
		return "success";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
