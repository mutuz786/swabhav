package com.techlabs.model.test;

import com.techlabs.model.*;

public class ContactTest {
	public static void main(String[] args) {
		Contact contact = new Contact();
		try {
			System.out.println(contact.display());
			contact.add(new Entry("saurabh", "khade", "5971375642", "khade22@gmail.com"));
			System.out.println("AFTER INSERTION:\n"+contact.display());
			contact.delete(Condition.FNAME, "murtaza");
			System.out.println("AFTER DELETION:\n"+contact.display());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			contact.close();
		}
	}
}
