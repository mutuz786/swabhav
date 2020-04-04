package com.techlabs.model;

import java.util.ArrayList;

public class Game {
	private int number;
	ArrayList<Integer> attempts = new ArrayList<Integer>();

	public void startGame() {
		this.number = (int) (100 * Math.random());
		guess();
	}

	private void guess() {
		GameTerminal gameTerminal = new GameTerminal();
		int guess = gameTerminal.requestGuess();
		if (guess < 0 || guess > 100) {
			gameTerminal.outOfBounds();
			guess();
		}
		if (guess < number) {
			gameTerminal.missed("low");
			attempts.add(guess);
			guess();
		}
		if (guess > number) {
			gameTerminal.missed("high");
			attempts.add(guess);
			guess();
		}
		if (guess == number) {
			attempts.add(guess);
			gameTerminal.congratulate(attempts);
			attempts.removeAll(attempts);
			loadMenu();
		}
	}

	private void loadMenu() {
		GameTerminal gameTerminal = new GameTerminal();
		int choice = gameTerminal.getchoice();
		switch (choice) {
		case 1:
			startGame();
			break;

		case 2:
			System.exit(0);
			break;

		default:
			loadMenu();
			break;
		}

	}
}
