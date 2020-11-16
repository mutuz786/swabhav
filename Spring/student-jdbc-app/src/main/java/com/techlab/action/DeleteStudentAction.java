package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.service.StudentService;

public class DeleteStudentAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String rollNo;
	@Autowired
	private StudentService studentService;

	@Override
	public String execute() throws Exception {
		studentService.deleteStudent(rollNo);
		return "success";
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

}
