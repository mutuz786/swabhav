package com.techlabs.singletontest;

public class Staff implements Weapon {
	private static Staff staff;

	private Staff() {
	}

	public static Staff getStaff() {
		if (staff == null)
			return staff = new Staff();
		return staff;
	}

	public void attack() {
		System.out.println("Attacked with staff");
	}
}
