package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.model.Student;
import com.techlab.service.StudentService;
import com.techlab.viewmodel.EditViewModel;

public class EditStudentAction extends ActionSupport implements ModelDriven<EditViewModel> {
	private static final long serialVersionUID = 1L;
	private EditViewModel editVM;
	@Autowired
	private StudentService studentService;

	public String execute() {
		Student student = studentService.getStudent(editVM.getId());
		editVM.setName(student.getName());
		editVM.setAddress(student.getAddress());
		editVM.setAge(student.getAge());
		return "success";
	}

	public String editDo() {
		studentService.editStudent(editVM.getId(), editVM.getName(), editVM.getAddress(), editVM.getAge());
		return "success";
	}

	public void validateEditDo() {
		if (editVM.getName() == "")
			addFieldError("name", "name required");
		if (editVM.getAddress() == "")
			addFieldError("address", "address required");
		if (editVM.getAge() == 0)
			addFieldError("age", "age required");
	}

	@Override
	public EditViewModel getModel() {
		editVM = new EditViewModel();
		return editVM;
	}

	public EditViewModel getEditVM() {
		return editVM;
	}

	public void setEditVM(EditViewModel editVM) {
		this.editVM = editVM;
	}

}
