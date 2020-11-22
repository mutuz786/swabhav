package com.techlab.entity;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Person {
	@Id
	private String id;
	private String name;
	@Lob
	private Blob img;

	public Person() {

	}

	public Person(String id, String name, Blob img) {
		this.id = id;
		this.name = name;
		this.img = img;
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

	public Blob getImg() {
		return img;
	}

	public void setImg(Blob img) {
		this.img = img;
	}
}
