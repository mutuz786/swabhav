package com.techlab.service;

import java.util.ArrayList;
import java.util.UUID;

import com.techlab.model.Contact;

public class Test {

	public static void main(String[] args) {
		Contact murtaza = new Contact(UUID.randomUUID().toString(), "gaurav", "hajiram", "dalvi", "652423",
				"gki@gmail.com");
		ContactService cs = ContactService.getInstance();
		// cs.addContact(murtaza);
		ArrayList<Contact> contacts = (ArrayList<Contact>) cs.searchContact("fname", "gaurav");
		for (Contact c : contacts) {
			System.out.println(c.getFname() + " " + c.getLname());
		}
	}

}
