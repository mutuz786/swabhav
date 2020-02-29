package com.techlabs.model;

public class Person {
	private String name;
	private int age;
	private String gender;
	private float height;
	private float weight;

	public Person(String pname, int page, String pgender, float pheight, float pweight) {
		name = validateName(pname);
		age = validateAge(page);
		gender = validateGender(pgender);
		height = validateParameter(pheight);
		weight = validateParameter(pweight);
	}

	private int validateAge(int parameter) {
		final int LOWER_LIMIT = 1;
		if (parameter < LOWER_LIMIT)
			return LOWER_LIMIT;
		return parameter;	
	}

	private String validateName(String name) {
		if (name == null)
			return "unknown";
		String nametrim = name.replaceAll(" ", "");
		if (nametrim.equals(""))
			return "unknown";
		return name;
	}

	private String validateGender(String gender) {
		if (gender == null)
			return "others";
		if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))
			return gender.toLowerCase();
		return "others";
	}

	private float validateParameter(float parameter) {
		final int LOWER_LIMIT = 1;
		if (parameter < LOWER_LIMIT)
			return LOWER_LIMIT;
		return parameter;
	}

	public void doWorkout() {
		weight = weight - (float) (weight * 0.02);
	}

	public void doEat() {
		weight = weight + (float) (weight * 0.05);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}
}
