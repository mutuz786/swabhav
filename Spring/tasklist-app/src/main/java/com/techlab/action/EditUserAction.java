package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.entity.User;
import com.techlab.service.UserService;
import com.techlab.viewmodel.EditUserViewModel;

public class EditUserAction extends ActionSupport implements ModelDriven<EditUserViewModel> {
	private static final long serialVersionUID = 1L;
	@Autowired
	private UserService service;
	private EditUserViewModel editUserVM;

	@Override
	public String execute() {
		User user = service.getUser(editUserVM.getId());
		editUserVM.setFirstName(user.getFirstName());
		editUserVM.setLastName(user.getLastName());
		editUserVM.setEmail(user.getEmail());
		editUserVM.setUsername(user.getUsername());
		editUserVM.setPassword(user.getPassword());
		return Action.SUCCESS;
	}

	public String editDo() {
		service.editUser(editUserVM.getId(), editUserVM.getFirstName(), editUserVM.getLastName(), editUserVM.getEmail(),
				editUserVM.getUsername(), editUserVM.getPassword());
		return Action.SUCCESS;
	}

	public void validateEditDo() {
		if (editUserVM.getFirstName() == "")
			addFieldError("firstName", "first name required");
		if (editUserVM.getLastName() == "")
			addFieldError("lastName", "last name required");
		if (editUserVM.getEmail() == "")
			addFieldError("email", "email required");
		if (editUserVM.getUsername() == "")
			addFieldError("username", "username required");
		if (editUserVM.getPassword() == "")
			addFieldError("password", "password required");

	}

	@Override
	public EditUserViewModel getModel() {
		editUserVM = new EditUserViewModel();
		return editUserVM;
	}

	public EditUserViewModel getEditUserVM() {
		return editUserVM;
	}

	public void setEditUserVM(EditUserViewModel editUserVM) {
		this.editUserVM = editUserVM;
	}

}
