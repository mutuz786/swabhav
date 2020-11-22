package com.techlab.service;

import java.sql.Blob;
import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlab.entity.Person;
import com.techlab.repository.PersonRepository;

@Service("personsvc")
public class PersonService {
	@Autowired
	private PersonRepository repo;

	public List<Person> getPersons() {
		return repo.getPersons();
	}

	public void addPerson(String id, String name, Blob img) {
		repo.adddPerson(id, name, img);
	}

	public void deletePerson(String id) {
		repo.deletePerson(id);
	}

	public Session getsession() {
		return repo.getsession();
	}

	public Person getperson(String id) {
		for (Person person : getPersons()) {
			if (person.getId().equals(id))
				return person;
		}
		return null;
	}
}
