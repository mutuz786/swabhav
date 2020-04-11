package com.techlabs.model;

import java.util.Scanner;

public class GameTerminal extends Game {
	public void start() {
		String result = null;
		int guess;
		gameInit();
		try (Scanner scan = new Scanner(System.in)) {
			while (result != "correct") {
				System.out.println("Enter guess:");
				guess = scan.nextInt();
				result = checkGuess(guess);
				System.out.println("The guess is " + result);
			}
		}
		System.out.println("score:" + getScore());
		loadMenu();
	}

	private void loadMenu() {
		System.out.println("1.Start again\t2.Exit");
		try (Scanner scanf = new Scanner(System.in)) {
			int choice = scanf.nextInt();
			switch (choice) {
			case 1:
				start();
				break;
			case 2:
				System.exit(0);
			default:
				loadMenu();
				break;
			}
		}
	}
}
