package com.techlab.action;

import java.util.UUID;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.model.Student;
import com.techlab.service.StudentService;

public class AddAction extends ActionSupport implements ModelDriven<Student> {
	private static final long serialVersionUID = 1L;
	private Student student;

	public String execute() {
		return "success";
	}

	public String add() {
		student.setId(UUID.randomUUID().toString());
		StudentService.getInstance().addStudent(student);
		return "success";
	}

	public void validateAdd() {
		if (student.getName() == "")
			addFieldError("name", "Name required");
		if (student.getAge() == 0)
			addFieldError("age", "age required");
		if (student.getEmail() == "")
			addFieldError("email", "email required");
		if (student.getCgpa() == 0)
			addFieldError("cgpa", "cgpa required");
	}

	@Override
	public Student getModel() {
		student = new Student();
		return student;
	}

}
