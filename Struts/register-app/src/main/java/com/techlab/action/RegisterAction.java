package com.techlab.action;

import org.apache.struts2.ServletActionContext;

import com.captcha.botdetect.web.servlet.Captcha;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.model.EmailDetail;
import com.techlab.service.EmailService;
import com.techlab.viewmodel.RegisterViewModel;

public class RegisterAction extends ActionSupport implements ModelDriven<RegisterViewModel> {
	private static final long serialVersionUID = 1L;
	private RegisterViewModel registerVM;
	private String passwordRepeat;
	private String message;
	private String captchaCode;

	public String execute() throws Exception {
		return "success";
	}

	public String registerDo() {
		message = "Registration Complete";
		message += "Your details are as follows:";
		message += "\nName:" + registerVM.getName();
		message += "\nEmail:" + registerVM.getEmail();
		message += "\nUsername:" + registerVM.getUsername();
		EmailService.getInstance().send(registerVM.getEmail(), message);
		return "success";
	}

	public void validateRegisterDo() {
		isEmpty(registerVM.getName(), "name");
		if (!isEmpty(registerVM.getEmail(), "email")) {
			if (!registerVM.getEmail().contains(".com"))
				addFieldError("email", "*enter valid email");
		}
		isEmpty(registerVM.getUsername(), "username");
		if (!isEmpty(registerVM.getPassword(), "password")) {
			if (registerVM.getPassword().length() < 8)
				addFieldError("password", "*password too weak");
			else if (!registerVM.getPassword().equals(passwordRepeat))
				addFieldError("passwordRepeat", "*password need to be same");
		}
		Captcha captcha = Captcha.load(ServletActionContext.getRequest(), "exampleCaptcha");
		boolean isHuman = captcha.validate(captchaCode);
		if (!isHuman) {
			addFieldError("captchaCode", "Incorrect code");
		}
		captchaCode = null;
	}

	private boolean isEmpty(String element, String key) {
		if (element.equals("")) {
			addFieldError(key, "*" + key + " required");
			return true;
		}
		return false;
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

	public String getPasswordRepeat() {
		return passwordRepeat;
	}

	public void setPasswordRepeat(String passwordRepeat) {
		this.passwordRepeat = passwordRepeat;
	}

	public String getMessage() {
		return message;
	}

	public String getCaptchaCode() {
		return captchaCode;
	}

	public void setCaptchaCode(String captchaCode) {
		this.captchaCode = captchaCode;
	}

}
