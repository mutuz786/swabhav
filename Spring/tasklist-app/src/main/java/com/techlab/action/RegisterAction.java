package com.techlab.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import com.captcha.botdetect.web.servlet.Captcha;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.service.UserService;
import com.techlab.viewmodel.RegisterViewModel;

public class RegisterAction extends ActionSupport implements ModelDriven<RegisterViewModel>{
	private static final long serialVersionUID = 1L;
	@Autowired
	private UserService service;
	private RegisterViewModel registerVM;

	@Override
	public String execute() {
		return Action.SUCCESS;
	}

	public String registerDo() {
		service.addUser(registerVM.getFirstName(), registerVM.getLastName(), registerVM.getEmail(),
				registerVM.getUsername(), registerVM.getPassword());
		
		return Action.SUCCESS;
	}

	public void validateRegisterDo() {
		if (registerVM.getFirstName() == "")
			addFieldError("firstName", "first name required");
		if (registerVM.getLastName() == "")
			addFieldError("lastName", "last name required");
		if (registerVM.getEmail() == "")
			addFieldError("email", "email required");
		if (registerVM.getUsername() == "")
			addFieldError("username", "username required");
		if (service.isUsernamePresent(registerVM.getUsername()))
			addFieldError("username", "username already taken");
		if (registerVM.getPassword() == "")
			addFieldError("password", "password required");
		if (!registerVM.getConfirmPassword().equals(registerVM.getPassword()))
			addFieldError("confirmPassword", "password doesnt match");
		Captcha captcha = Captcha.load(ServletActionContext.getRequest(), "capthcaFile");
		boolean isHuman = captcha.validate(registerVM.getCaptchaCode());
		if (!isHuman) {
			addFieldError("captchaCode", "Incorrect code");
		}
		registerVM.setCaptchaCode(null);

	}

	@Override
	public RegisterViewModel getModel() {
		registerVM = new RegisterViewModel();
		return registerVM;
	}

	public RegisterViewModel getRegisterVM() {
		return registerVM;
	}

	public void setRegisterVM(RegisterViewModel registerVM) {
		this.registerVM = registerVM;
	}
}
