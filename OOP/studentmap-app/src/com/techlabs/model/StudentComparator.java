package com.techlabs.model;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		String s1 = student1.getRollNo() + "" + student1.getStandard();
		String s2 = student2.getRollNo() + "" + student2.getStandard();
		return s1.compareTo(s2);
	}
}
