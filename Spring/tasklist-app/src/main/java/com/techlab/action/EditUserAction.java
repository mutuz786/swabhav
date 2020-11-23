package com.techlab.action;

import java.io.FileInputStream;
import java.sql.Blob;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.entity.User;
import com.techlab.service.UserService;
import com.techlab.viewmodel.EditUserViewModel;

public class EditUserAction extends ActionSupport implements ModelDriven<EditUserViewModel>, SessionAware {
	private static final long serialVersionUID = 1L;
	@Autowired
	private UserService uService;
	private EditUserViewModel editUserVM;
	private SessionMap<String, Object> session;

	@Override
	public String execute() {
		User user = uService.getUser(editUserVM.getId());
		editUserVM.setFirstName(user.getFirstName());
		editUserVM.setLastName(user.getLastName());
		editUserVM.setEmail(user.getEmail());
		editUserVM.setUsername(user.getUsername());
		editUserVM.setPassword(user.getPassword());
		return Action.SUCCESS;
	}

	public String editDo() throws Exception {
		FileInputStream stream = new FileInputStream(editUserVM.getImg());
		Blob imgBlob = Hibernate.getLobCreator(uService.getSession()).createBlob(stream, editUserVM.getImg().length());
		uService.editUser(editUserVM.getId(), editUserVM.getFirstName(), editUserVM.getLastName(),
				editUserVM.getEmail(), editUserVM.getUsername(), editUserVM.getPassword(), imgBlob);
		return Action.SUCCESS;
	}

	public String setBlockedDo() {
		User user1 = uService.getUser(editUserVM.getId());
		User user2 = (User) session.get("loginUser");
		System.out.println(user1.getId() + "|" + user2.getId());
		if (!user1.getId().equals(user2.getId())) {
			if (user1.isBlocked())
				uService.setBlocked(editUserVM.getId(), false);
			else
				uService.setBlocked(editUserVM.getId(), true);
		}
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

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>) session;
	}

	public SessionMap<String, Object> getSession() {
		return session;
	}

}
