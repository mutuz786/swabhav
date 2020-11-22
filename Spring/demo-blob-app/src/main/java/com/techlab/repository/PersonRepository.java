package com.techlab.repository;

import java.sql.Blob;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlab.entity.Person;

@Repository
@Transactional
public class PersonRepository {
	@Autowired
	private SessionFactory factory;

	@SuppressWarnings("unchecked")
	public List<Person> getPersons() {
		return factory.getCurrentSession().createQuery("from Person").list();
	}

	public void adddPerson(String id, String name, Blob img) {
		factory.getCurrentSession().save(new Person(id, name, img));
	}

	public void deletePerson(String id) {
		for (Person person : getPersons()) {
			if (person.getId().equals(id)) {
				factory.getCurrentSession().delete(person);
				return;
			}
		}
	}
	public Session getsession() {
		return factory.openSession();
	}
}
