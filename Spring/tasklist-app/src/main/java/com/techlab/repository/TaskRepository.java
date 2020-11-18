package com.techlab.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlab.entity.Task;
import com.techlab.entity.User;

@Repository
@Transactional
public class TaskRepository {
	@Autowired
	private SessionFactory fact;

	@SuppressWarnings("unchecked")
	public List<Task> getTasks(String id) {
		List<Task> tasks = new ArrayList<Task>();
		for (Task task : (List<Task>) fact.getCurrentSession().createQuery("from Task").list()) {
			if (task.getUser().getId().equals(id)) {
				tasks.add(task);
			}
		}
		return tasks;
	}

	public void addTask(String title, User user) {
		Task task = new Task(UUID.randomUUID().toString(), title, "", false, user);
		fact.getCurrentSession().save(task);
	}

	public void deleteTask(String id) {
		fact.getCurrentSession().delete(getTask(id));
	}

	public void editTask(String id, String title) {
		Task task = getTask(id);
		task.setTitle(title);
		fact.getCurrentSession().update(task);
	}

	@SuppressWarnings("unchecked")
	public Task getTask(String id) {
		for (Task task : (List<Task>) fact.getCurrentSession().createQuery("from Task").list()) {
			if (task.getId().equals(id))
				return task;
		}
		return null;
	}

}
