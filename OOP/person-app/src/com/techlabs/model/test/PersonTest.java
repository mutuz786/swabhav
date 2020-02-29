package com.techlabs.model.test;

import com.techlabs.model.Person;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("abc", 20, "male", 6.5f, 100f);
		printInfo(p1);
		p1.doWorkout();
		printInfo(p1);
		p1.doEat();
		printInfo(p1);

		Person p2 = new Person(null, 65, "female", 5.8f, 54f);
		printInfo(p2);

		Person p3 = new Person("    ", 53, "luna", 9f, 62f);
		printInfo(p3);

		Person p4 = new Person("vegeta", 21, null, 6.2f, 82.6f);
		printInfo(p4);

		Person p5 = new Person("goku", 32, "others", -2.5f, -70.8f);
		printInfo(p5);

		Person p6 = new Person("krilin", -87, "MalE", 9.4f, 60f);
		printInfo(p6);

	}

	private static void printInfo(Person p) {
		System.out.printf("Name:%s \t Age:%d \t Gender:%s \t Height:%.2f \t Weight:%.2f \n", p.getName(), p.getAge(),
				p.getGender(), p.getHeight(), p.getWeight());
	}
}
