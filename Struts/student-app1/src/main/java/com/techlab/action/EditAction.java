package com.techlab.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.model.Student;
import com.techlab.service.StudentService;
import com.techlab.viewmodel.EditVM;

public class EditAction extends ActionSupport implements ModelDriven<EditVM> {
	private static final long serialVersionUID = 1L;
	private EditVM editVM;

	public String execute() throws Exception {
		Student stud = StudentService.getInstance().searchStudent(editVM.getId());
		editVM.setId(stud.getId());
		editVM.setName(stud.getName());
		editVM.setEmail(stud.getEmail());
		editVM.setAge(stud.getAge());
		editVM.setCgpa(stud.getCgpa());
		return "success";
	}

	public String edit() {
		StudentService.getInstance().updateStudent(editVM.getId(), editVM.getName(), editVM.getAge(), editVM.getEmail(),
				editVM.getCgpa());
		return "success";
	}

	public void validateEdit() {
		if (editVM.getName() == "")
			addFieldError("name", "Name required");
		if (editVM.getAge() == 0)
			addFieldError("age", "age required");
		if (editVM.getEmail() == "")
			addFieldError("email", "email required");
		if (editVM.getCgpa() == 0)
			addFieldError("cgpa", "cgpa required");
	}

	public EditVM getStudent() {
		return editVM;
	}

	public void setStudent(EditVM editVM) {
		this.editVM = editVM;
	}

	@Override
	public EditVM getModel() {
		editVM = new EditVM();
		return editVM;
	}

}
