package com.techlab.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlab.entity.SubTask;
import com.techlab.entity.Task;

@Repository
@Transactional
public class SubTaskRepository {
	@Autowired
	private SessionFactory fact;

	@SuppressWarnings("unchecked")
	public List<SubTask> getSubTasks(String id) {
		List<SubTask> subTasks = new ArrayList<SubTask>();
		for (SubTask subTask : (List<SubTask>) fact.getCurrentSession().createQuery("from SubTask").list()) {
			if (subTask.getTask().getId().equals(id)) {
				subTasks.add(subTask);
			}
		}
		return subTasks;
	}

	public void addSubTask(String title, Task task) {
		SubTask subTask = new SubTask(UUID.randomUUID().toString(), title, "", false, task);
		fact.getCurrentSession().save(subTask);
	}

	public void deleteSubTask(String id) {
		fact.getCurrentSession().delete(getSubTask(id));
	}

	public void editSubTask(String id, String title) {
		SubTask subTask = getSubTask(id);
		subTask.setTitle(title);
		fact.getCurrentSession().update(subTask);
	}

	@SuppressWarnings("unchecked")
	public SubTask getSubTask(String id) {
		for (SubTask subtask : (List<SubTask>) fact.getCurrentSession().createQuery("from SubTask").list()) {
			if (subtask.getId().equals(id))
				return subtask;
		}
		return null;
	}

	public void updateStatus(String id, boolean done, String date) {
		SubTask subTask = getSubTask(id);
		subTask.setDone(done);
		subTask.setDate(date);
		fact.getCurrentSession().update(subTask);
	}

}
