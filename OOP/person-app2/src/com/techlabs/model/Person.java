package com.techlabs.model;

public class Person {
	private String name;
	private int age;
	private GenderType gender;
	private float height;
	private float weight;

	public Person(String pname, int page, GenderType pgender, float pheight, float pweight) {
		name = validateName(pname);
		age = validateAge(page);
		gender = pgender;
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

	public GenderType getGender() {
		return gender;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}
}
