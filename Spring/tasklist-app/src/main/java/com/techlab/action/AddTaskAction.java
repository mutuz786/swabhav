package com.techlab.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.entity.User;
import com.techlab.service.TaskService;
import com.techlab.viewmodel.AddTaskViewModel;

public class AddTaskAction extends ActionSupport implements ModelDriven<AddTaskViewModel>, SessionAware {
	private static final long serialVersionUID = 1L;
	@Autowired
	private TaskService service;
	private AddTaskViewModel addVM;
	private SessionMap<String, Object> session;

	@Override
	public String execute() throws Exception {
		return Action.SUCCESS;
	}

	public String addDo() {
		User user = (User) session.get("user");
		service.addTask(addVM.getTitle(), user);
		return Action.SUCCESS;
	}

	public void validateAddDo() {
		if (addVM.getTitle() == "")
			addFieldError("title", "title required");
	}

	@Override
	public AddTaskViewModel getModel() {
		addVM = new AddTaskViewModel();
		return addVM;
	}

	public AddTaskViewModel getAddVM() {
		return addVM;
	}

	public void setAddVM(AddTaskViewModel addVM) {
		this.addVM = addVM;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>) session;
	}

}
