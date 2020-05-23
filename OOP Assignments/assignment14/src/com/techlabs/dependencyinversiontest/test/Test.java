package com.techlabs.dependencyinversiontest.test;

import com.techlabs.dependencyinversiontest.*;

public class Test {
	public static void main(String[] args) {
		Student murtaza = new Student(101, "Murtaza", "Mumbai", 23, 7.00);
		printInfo(murtaza);
	}

	private static void printInfo(PersonalData person) {
		System.out.println("Id:" + person.getId() + "\nName:" + person.getName() + "\nAddress" + person.getAddress()
				+ "\nAge:" + person.getAge());
	}
}