package com.techlabs.singletontest.test;

import com.techlabs.singletontest.*;

public class Test {

	public static void main(String[] args) {
		Weapon sword = Sword.getSword();
		Weapon staff = Staff.getStaff();

		sword.attack();
		staff.attack();
	}

}
