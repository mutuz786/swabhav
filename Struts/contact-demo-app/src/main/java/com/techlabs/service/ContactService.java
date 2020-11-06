package com.techlabs.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Contact;

public class ContactService {
	private static ContactService cs = null;
	Connection conn = null;
	Statement stmt = null;

	private ContactService() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager
					.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = (Statement) conn.createStatement();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static ContactService getInstance() {
		if (cs == null)
			cs = new ContactService();
		return cs;
	}

	public void editContact(Contact contact) {
		try {
			stmt.executeUpdate("update contact set fname='" + contact.getFname() + "',mname='" + contact.getMname()
					+ "',lname='" + contact.getLname() + "',phoneno='" + contact.getPhoneNo() + "',email='"
					+ contact.getEmail() + "' where id ='" + contact.getId() + "'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteContact(Contact contact) {
		try {
			stmt.executeUpdate("delete from contact where id ='" + contact.getId() + "'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addContact(Contact contact) {
		try {
			stmt.executeUpdate("insert into contact values('" + contact.getId() + "','" + contact.getFname() + "','"
					+ contact.getMname() + "','" + contact.getLname() + "','" + contact.getPhoneNo() + "','"
					+ contact.getEmail() + "')");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Contact> getContacts() {
		List<Contact> contacts = new ArrayList<Contact>();
		ResultSet rs = null;
		try {
			rs = (ResultSet) stmt.executeQuery("select * from contact");
			if (rs != null) {
				while (rs.next()) {
					Contact contact = new Contact(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getString(5), rs.getString(6));
					contacts.add(contact);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return contacts;
	}

	public Contact getContact(String id) {
		for (Contact contact : getContacts()) {
			if (contact.getId().equals(id))
				return contact;
		}
		return null;
	}
}