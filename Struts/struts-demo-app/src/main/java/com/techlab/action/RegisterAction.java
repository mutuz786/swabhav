package com.techlab.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.model.RegisterVM;

public class RegisterAction extends ActionSupport implements ModelDriven<RegisterVM> {
	private static final long serialVersionUID = 1L;
	private RegisterVM vm;
	private String passwordRepeat;

	@Override
	public RegisterVM getModel() {
		System.out.println("in getModel");
		vm = new RegisterVM();
		return vm;
	}

	public String execute() throws Exception {
		return "success";
	}

	public void validate() {
		System.out.println("in validate");
		isEmpty(vm.getName(), "name");
		if (!isEmpty(vm.getEmail(), "email")) {
			if (!vm.getEmail().contains(".com"))
				addFieldError("email", "*enter valid email");
		}
		isEmpty(vm.getUsername(), "username");
		if (!isEmpty(vm.getPassword(), "password")) {
			if (vm.getPassword().length() < 8)
				addFieldError("password", "*password too weak");
			else if (!vm.getPassword().equals(passwordRepeat))
				addFieldError("passwordRepeat", "*password need to be same");

		}
	}

	private boolean isEmpty(String element, String key) {
		if (element.equals("")) {
			addFieldError(key, "*" + key + " required");
			return true;
		}
		return false;
	}

	public String registerDo() {
		String detailMessage = "Registration Complete,\nYour details are as follows:";
		detailMessage += " Name:" + vm.getName();
		detailMessage += ", Email:" + vm.getEmail();
		detailMessage += ", Username:" + vm.getUsername();
		detailMessage += ", Password:" + vm.getPassword();
		vm.setMessage(detailMessage);
		return "success";
	}

	public String getPasswordRepeat() {
		return passwordRepeat;
	}

	public void setPasswordRepeat(String passwordRepeat) {
		System.out.println("in setters");
		this.passwordRepeat = passwordRepeat;
	}

	public RegisterVM getVm() {
		return vm;
	}

	public void setVm(RegisterVM vm) {
		this.vm = vm;
	}
}
