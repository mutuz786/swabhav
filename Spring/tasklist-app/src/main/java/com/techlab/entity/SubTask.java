package com.techlab.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SubTask {
	@Id
	private String id;
	private String title;
	private String date;
	private boolean done;
	@ManyToOne
	@JoinColumn
	private Task task;

	public SubTask() {

	}

	public SubTask(String id, String title, String date, boolean done, Task task) {
		this.id = id;
		this.title = title;
		this.date = date;
		this.done = done;
		this.task = task;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

}
