package com.techlabs.model;

public class Game {
	private int randomNumber;
	private int guessCount;
	private String status;

	public void gameInit() {
		status = "Notstarted";
		this.randomNumber = (int) (100 * Math.random());
		guessCount = 0;
	}

	public String checkGuess(int guess) {
		status = "inprogress";
		guessCount++;
		if (guess < randomNumber && guess > 0)
			return "too low";
		if (guess > randomNumber && guess < 100)
			return "too high";
		if (guess == randomNumber)
			return "correct";
		status = "hasresult";
		return "out of bounds";

	}

	public int getScore() {
		status = "end";
		int score = 100 - (10 * guessCount);
		if (score < 5)
			return 5;
		return score;
	}

	public String getStatus() {
		return status;
	}

	public int getRandomNumber() {
		return randomNumber;
	}
}
