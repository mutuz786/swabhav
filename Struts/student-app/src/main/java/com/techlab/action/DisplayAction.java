package com.techlab.action;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.techlab.model.Student;
import com.techlab.service.StudentService;

public class DisplayAction implements Action {
	private List<Student> students;

	@Override
	public String execute() throws Exception {
		students = StudentService.getInstance().getStudents();
		return "success";
	}

	public List<Student> getStudents() {
		return students;
	}

}
