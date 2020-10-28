package com.techlab.model;

import java.util.ArrayList;

public class StudentDB {
	private static String[] murtaza = { "101", "murtaza", "khilawala", "mumbai", "abc@gmail.com" };
	private static String[] gaurav = { "102", "gaurav", "kamble", "mumbai", "def@gmail.com" };
	private static String[] rahul = { "103", "rahul", "dalvi", "surat", "ghi@gmail.com" };
	private static String[] sagar = { "104", "sagar", "kirtane", "mumbai", "jkl@gmail.com" };

	private static ArrayList<String[]> students = new ArrayList<String[]>() {
		{
			add(murtaza);
			add(gaurav);
			add(rahul);
			add(sagar);
		}
	};

	public static void add(String[] entry) {
		students.add(entry);
	}

	public static ArrayList<String[]> getData() {
		return students;
	}
}
