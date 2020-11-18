package com.techlab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlab.entity.SubTask;
import com.techlab.entity.Task;
import com.techlab.repository.SubTaskRepository;

@Service
public class SubTaskService {
	@Autowired
	private SubTaskRepository repository;

	public List<SubTask> getSubTasks(String id) {
		return repository.getSubTasks(id);
	}

	public void addSubTask(String title, Task task) {
		repository.addSubTask(title, task);
	}

	public void deleteSubTask(String id) {
		repository.deleteSubTask(id);
	}

	public void editSubTask(String id, String title) {
		repository.editSubTask(id, title);
	}

	public SubTask getSubTask(String id) {
		return repository.getSubTask(id);
	}
}
