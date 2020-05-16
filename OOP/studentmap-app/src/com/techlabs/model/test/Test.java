package com.techlabs.model.test;

import java.util.*;
import java.util.Map.Entry;

import com.techlabs.model.*;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student(1, 10, "abc", 7.3);
		Student s2 = new Student(1, 10, "xyz", 7.3);
		Student s3 = new Student(10, 1, "mno", 7.3);

		Map<Student, Student> students = new HashMap<Student, Student>();
		students.put(s1, s1);
		students.put(s2, s2);
		students.put(s3, s3);
		System.out.println(students.size());
		printInfo(students);

		Map<Student, Student> students1 = new TreeMap<Student, Student>(new StudentComparator());
		students1.put(s1, s1);
		students1.put(s2, s2);
		students1.put(s3, s3);
		System.out.println(students1.size());
		printInfo(students1);
	}

	private static void printInfo(Map<Student, Student> students) {
		for(Entry<Student, Student> student:students.entrySet()) {
			System.out.println(student.getValue().getName());
		}
	}
}
