package com.techlabs.model;


public class Main extends Input {
	private int guessCount;
	private int number;

	public void startGame() {
		this.number = (int) (100 * Math.random());
		guess();
	}

	private void guess() {
		System.out.print("Guess A Number:");
		int guess = takeInput();
		if (guess < 0 || guess > 100) {
			System.out.println("Enter Between 1-100");
			guess();
			return;
		}
		if (guess < number) {
			System.out.println("You guessed too low");
			guessCount++;
			guess();
			return;
		}
		if (guess > number) {
			System.out.println("You guessed too high");
			guessCount++;
			guess();
			return;
		}
		if (guess == number) {
			guessCount++;
			System.out.println("You won the game\nAnd you made " + guessCount + " guesses");
			Menu menu=new Menu();
			menu.loadMenu();
			return;
		}
	}
}
