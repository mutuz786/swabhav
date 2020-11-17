package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.service.StudentService;

public class DeleteStudentAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String id;
	@Autowired
	private StudentService studentService;

	@Override
	public String execute() throws Exception {
		studentService.deleteStudent(id);
		return "success";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
