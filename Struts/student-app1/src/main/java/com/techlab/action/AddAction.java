package com.techlab.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.service.StudentService;
import com.techlab.viewmodel.AddVM;

public class AddAction extends ActionSupport implements ModelDriven<AddVM> {
	private static final long serialVersionUID = 1L;
	private AddVM addVM;

	public String execute() {
		return "success";
	}

	public String add() {
		StudentService.getInstance().addStudent(addVM.getName(), addVM.getAge(), addVM.getEmail(), addVM.getCgpa());
		return "success";
	}

	public void validateAdd() {
		if (addVM.getName() == "")
			addFieldError("name", "Name required");
		if (addVM.getAge() == 0)
			addFieldError("age", "age required");
		if (addVM.getEmail() == "")
			addFieldError("email", "email required");
		if (addVM.getCgpa() == 0)
			addFieldError("cgpa", "cgpa required");
	}

	@Override
	public AddVM getModel() {
		addVM = new AddVM();
		return addVM;
	}

}
