package com.techlabs.dependencyinversiontest.test;

import com.techlabs.dependencyinversiontest.*;

public class Test {
	public static void main(String[] args) {
		Student murtaza = new Student(new PersonalData(101, "Murtaza", "Mumbai", 23), 7.00);
		printInfo(murtaza);
	}

	private static void printInfo(Student student) {
		PersonalData pData = student.getPersonalData();
		System.out.println("Id:" + pData.getId() + "\nName:" + pData.getName() + "\nAddress" + pData.getAddress()
				+ "\nAge:" + pData.getAge() + "\ncgpa" + student.getCgpa());
	}
}
