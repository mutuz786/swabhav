package com.techlab.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.model.Student;
import com.techlab.service.StudentService;

public class EditAction extends ActionSupport implements ModelDriven<Student> {
	private static final long serialVersionUID = 1L;
	private Student student;

	public String execute() throws Exception {
		student = StudentService.getInstance().searchStudent(student.getId());
		return "success";
	}

	public String edit() {
		StudentService.getInstance().updateStudent(student);
		return "success";
	}

	public void validateEdit() {
		if (student.getName() == "")
			addFieldError("name", "Name required");
		if (student.getAge() == 0)
			addFieldError("age", "age required");
		if (student.getEmail() == "")
			addFieldError("email", "email required");
		if (student.getCgpa() == 0)
			addFieldError("cgpa", "cgpa required");
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public Student getModel() {
		student = new Student();
		return student;
	}

}
