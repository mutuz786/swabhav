package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlab.service.StudentService;

public class StudentAction implements Action {

	@Autowired
	private StudentService studentService;

	@Override
	public String execute() throws Exception {
		System.out.println("in execute method(students size:" + studentService.getStudent().size() + ")");
		return "none";
	}

}
