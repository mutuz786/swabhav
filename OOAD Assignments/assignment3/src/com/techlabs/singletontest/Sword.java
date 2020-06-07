package com.techlabs.singletontest;

public class Sword implements Weapon {
	private static final Sword sword = new Sword();

	private Sword() {
	}

	public static Sword getSword() {
		return sword;
	}

	public void attack() {
		System.out.println("Attacked with sword");
	}
}
