package com.techlab.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlab.entity.Task;
import com.techlab.entity.User;
import com.techlab.service.TaskService;

public class DisplayTaskAction implements Action, SessionAware {
	@Autowired
	private TaskService service;
	private String id;
	private List<Task> tasks;
	private SessionMap<String, Object> session;
	private List<Integer> lengths;

	@Override
	public String execute() throws Exception {
		User user = (User) session.get("user");
		if (user == null)
			return Action.ERROR;
		tasks = service.getTasks(user.getId());
		lengths = new ArrayList<Integer>();
		for (Task temp : tasks) {
			lengths.add(temp.getSubTasks().size());
		}
		return Action.SUCCESS;
	}

	@SuppressWarnings("deprecation")
	public String doCheck() {
		Task task = service.getTask(id);
		if (task.getDate().length() == 0) {
			service.updateStatus(id, true, new Date().toGMTString());
		} else {
			service.updateStatus(id, false, "");
		}
		return Action.SUCCESS;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>) session;
	}

	public List<Integer> getLengths() {
		return lengths;
	}

	public void setLengths(List<Integer> lengths) {
		this.lengths = lengths;
	}

}
