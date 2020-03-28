package com.techlabs.model;

public class Student {
	private int id;
	private String name;
	private float cgpa;
	private static int count;
	static {
		count = 0;
		System.out.println("inside static block");
	}

	public Student(int id, String name, float cgpa) {
		this.id = validId(id);
		this.name = validName(name);
		this.cgpa = validCgpa(cgpa);
		count++;
		System.out.println("inside constructor");
	}

	private float validCgpa(float cgpa) {
		float LOWER_LIMIT = 0.00f;
		float UPPER_LIMIT = 10.00f;
		if (cgpa < LOWER_LIMIT)
			return LOWER_LIMIT;
		if (cgpa > UPPER_LIMIT)
			return UPPER_LIMIT;
		return cgpa;
	}

	private String validName(String name) {
		if (name == null || name == "\\s")
			return "unknown";
		return name;
	}

	private int validId(int id) {
		if (id < 0)
			return count;
		return id;
	}

	public Student(int id, String name) {
		this(id, name, 7.00f);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getCgpa() {
		return cgpa;
	}

	public static int getCount() {
		return count;
	}

}
