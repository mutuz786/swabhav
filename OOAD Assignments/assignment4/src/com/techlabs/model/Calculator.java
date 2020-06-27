package com.techlabs.model;

import java.util.ArrayList;

public class Calculator {
	private ArrayList<Arithematic> arithematics = new ArrayList<Arithematic>();
	private int number1;
	private int number2;

	public void addArithematic(Arithematic arithematic) {
		arithematics.add(arithematic);
	}

	public void update(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
		updateAll();
	}

	private void updateAll() {
		for (Arithematic arithematic : arithematics) {
			arithematic.update();
		}
	}

	public int getNumber1() {
		return number1;
	}

	public int getNumber2() {
		return number2;
	}
}
