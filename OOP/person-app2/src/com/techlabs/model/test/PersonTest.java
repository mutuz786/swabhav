package com.techlabs.model.test;

import com.techlabs.model.GenderType;
import com.techlabs.model.Person;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("abc", 20, GenderType.MALE, 6.5f, 100f);
		printInfo(p1);
		p1.doWorkout();
		printInfo(p1);
		p1.doEat();
		printInfo(p1);

		Person p2 = new Person(null, 65, GenderType.MALE, 5.8f, 54f);
		printInfo(p2);

		Person p3 = new Person("    ", 53, GenderType.FEMALE, 9f, 62f);
		printInfo(p3);

		Person p4 = new Person("goku", 32, GenderType.OTHERS, -2.5f, -70.8f);
		printInfo(p4);

		Person p6 = new Person("krilin", -87, GenderType.MALE, 9.4f, 60f);
		printInfo(p6);

	}

	private static void printInfo(Person p) {
		System.out.printf("Name:%s \t Age:%d \t Gender:%s \t Height:%.2f \t Weight:%.2f \n", p.getName(), p.getAge(),
				p.getGender(), p.getHeight(), p.getWeight());
	}
}
