package com.techlab.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlab.entity.SubTask;
import com.techlab.entity.Task;
import com.techlab.service.SubTaskService;

public class DisplaySubTaskAction implements Action, SessionAware {
	@Autowired
	private SubTaskService service;
	private String id;
	private List<SubTask> subTasks;
	private SessionMap<String, Object> session;

	@Override
	public String execute() throws Exception {
		Task task = (Task) session.get("task");
		if (task == null)
			return Action.ERROR;
		subTasks = service.getSubTasks(task.getId());
		return Action.SUCCESS;
	}

	public String doCheck() {
		SubTask subTask = service.getSubTask(id);
		Date date = null;
		if (subTask.getDate().length() == 0) {
			date = new Date();
			subTask.setDate(date.toGMTString());
			subTask.setDone(true);
		} else {
			subTask.setDate("");
			subTask.setDone(false);
		}
		service.updateStatus(id, subTask.isDone(), subTask.getDate());
		return Action.SUCCESS;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>) session;
	}

	public List<SubTask> getSubTasks() {
		return subTasks;
	}

	public void setSubTasks(List<SubTask> subTasks) {
		this.subTasks = subTasks;
	}
}
