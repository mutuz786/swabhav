package com.techlab.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import com.captcha.botdetect.web.servlet.Captcha;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.service.EmailService;
import com.techlab.service.UserService;
import com.techlab.viewmodel.RegisterViewModel;

public class RegisterAction extends ActionSupport implements ModelDriven<RegisterViewModel> {
	private static final long serialVersionUID = 1L;
	@Autowired
	private UserService uService;
	@Autowired
	private EmailService eService;
	private RegisterViewModel registerVM;

	@Override
	public String execute() {
		return Action.SUCCESS;
	}

	public String registerDo() {
		uService.addUser(registerVM.getFirstName(), registerVM.getLastName(), registerVM.getEmail(),
				registerVM.getUsername(), registerVM.getPassword());
		final String message = "Congratulations " + registerVM.getFirstName()
				+ "\nYou have completed your registration process\nHere are your details:\n" + "\nFirstName:"
				+ registerVM.getFirstName() + "\nLastName:" + registerVM.getLastName() + "\nEmail:"
				+ registerVM.getEmail() + "\nUsername:" + registerVM.getUsername() + "\nPassword:"
				+ registerVM.getPassword();
		new Thread(new Runnable() {
			public void run() {
				eService.send(registerVM.getEmail(), message);
			}
		}).start();
		return Action.SUCCESS;
	}

	public void validateRegisterDo() {
		if (uService.isUsernamePresent(registerVM.getUsername()))
			addFieldError("username", "username already taken");
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
