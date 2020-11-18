package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.entity.SubTask;
import com.techlab.service.SubTaskService;
import com.techlab.viewmodel.EditTaskViewModel;

public class EditSubTaskAction extends ActionSupport implements ModelDriven<EditTaskViewModel> {
	private static final long serialVersionUID = 1L;
	@Autowired
	private SubTaskService service;
	private EditTaskViewModel editVM;
	private String link;

	@Override
	public String execute() throws Exception {
		SubTask task = service.getSubTask(editVM.getId());
		editVM.setTitle(task.getTitle());
		return Action.SUCCESS;
	}

	public String editDo() {
		service.editSubTask(editVM.getId(), editVM.getTitle());
		return Action.SUCCESS;
	}

	public void validateEditDo() {
		if (editVM.getTitle() == "")
			addFieldError("title", "title required");
		link = "editTask?id=" + editVM.getId();
	}

	@Override
	public EditTaskViewModel getModel() {
		editVM = new EditTaskViewModel();
		return editVM;
	}

	public EditTaskViewModel getEditVM() {
		return editVM;
	}

	public void setEditVM(EditTaskViewModel editVM) {
		this.editVM = editVM;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}
