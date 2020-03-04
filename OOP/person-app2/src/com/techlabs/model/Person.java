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

	public float calculateBmi() {
		return weight / (height * height);
	}

	public String calculateBodyType1() {
		switch (checkWeight(calculateBmi())) {
		case 0:
			return "Underweight";
		case 1:
			return "Ideal Weight";
		case 2:
			return "Overweight";
		case 3:
			return "Obesity";
		default:
			break;
		}
		return "unavailable";
	}

	private int checkWeight(float bmi) {
		final float MAX_UNDER = 18.5f;
		final float MAX_IDEAL = 24.9f;
		final float MAX_OVER = 29.9f;
		final float MIN_OBESE = 30.0f;
		if (bmi < MAX_UNDER)
			return 0;
		else if (bmi < MAX_IDEAL)
			return 1;
		else if (bmi < MAX_OVER)
			return 2;
		else if (bmi > MIN_OBESE)
			return 3;
		return -1;
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
