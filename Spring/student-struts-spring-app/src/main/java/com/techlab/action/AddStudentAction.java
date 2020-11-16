package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.service.StudentService;
import com.techlab.viewmodel.AddViewModel;

public class AddStudentAction extends ActionSupport implements ModelDriven<AddViewModel> {
	private static final long serialVersionUID = 1L;
	private AddViewModel addVM;
	@Autowired
	private StudentService studentService;

	public String execute() {
		return "success";
	}

	public String addDo() {
		studentService.addStudent(addVM.getName(), addVM.getAddress(), addVM.getAge());
		return "success";
	}

	public void validateAddDo() {
		if (addVM.getName() == "")
			addFieldError("name", "name required");
		if (addVM.getAddress() == "")
			addFieldError("address", "address required");
		if (addVM.getAge() == 0)
			addFieldError("age", "age required");
	}

	@Override
	public AddViewModel getModel() {
		addVM = new AddViewModel();
		return addVM;
	}

	public AddViewModel getAddVM() {
		return addVM;
	}

	public void setAddVM(AddViewModel addVM) {
		this.addVM = addVM;
	}

}
