package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.service.UserService;
import com.techlab.viewmodel.AddUserViewModel;

public class RegisterAction extends ActionSupport implements ModelDriven<AddUserViewModel> {
	private static final long serialVersionUID = 1L;
	@Autowired
	private UserService service;
	private AddUserViewModel addUserVM;

	@Override
	public String execute() {
		return Action.SUCCESS;
	}

	public String registerDo() {
		service.addUser(addUserVM.getFirstName(), addUserVM.getLastName(), addUserVM.getEmail(),
				addUserVM.getUsername(), addUserVM.getPassword());
		return Action.SUCCESS;
	}

	public void validateRegisterDo() {
		if (addUserVM.getFirstName() == "")
			addFieldError("firstName", "first name required");
		if (addUserVM.getLastName() == "")
			addFieldError("lastName", "last name required");
		if (addUserVM.getEmail() == "")
			addFieldError("email", "email required");
		if (addUserVM.getUsername() == "")
			addFieldError("username", "username required");
		if (addUserVM.getPassword() == "")
			addFieldError("password", "password required");
	}

	@Override
	public AddUserViewModel getModel() {
		addUserVM = new AddUserViewModel();
		return addUserVM;
	}

	public AddUserViewModel getAddUserVM() {
		return addUserVM;
	}

	public void setAddUserVM(AddUserViewModel addUserVM) {
		this.addUserVM = addUserVM;
	}
}
