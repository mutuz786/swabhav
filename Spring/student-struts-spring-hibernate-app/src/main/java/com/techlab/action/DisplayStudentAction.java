package com.techlab.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlab.model.Student;
import com.techlab.service.StudentService;

public class DisplayStudentAction implements Action {
	@Autowired
	private StudentService studentService;
	private List<Student> students;

	@Override
	public String execute() throws Exception {
		students = studentService.getStudents();
		return Action.SUCCESS;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
