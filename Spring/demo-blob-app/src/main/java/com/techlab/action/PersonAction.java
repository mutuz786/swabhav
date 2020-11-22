package com.techlab.action;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;
import java.util.List;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.techlab.entity.Person;
import com.techlab.service.PersonService;

public class PersonAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	@Autowired
	private PersonService service;
	private String id;
	private String name;
	private File img;
	private List<Person> persons;

	public String execute() throws Exception {
		persons = service.getPersons();
		return Action.SUCCESS;
	}

	public String addDo() throws Exception {
		FileInputStream stream = new FileInputStream(img);
		Blob blob = Hibernate.getLobCreator(service.getsession()).createBlob(stream, img.length());
		service.addPerson(id, name, blob);
		return Action.SUCCESS;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public File getImg() {
		return img;
	}

	public void setImg(File img) {
		this.img = img;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

}
