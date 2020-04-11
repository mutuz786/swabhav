package com.techlabs.model;

public class Game {
	private int randomNumber;
	private int guessCount;
	private String status;
	
	public void gameInit() {
		status="Notstarted";
		this.randomNumber = (int) (100 * Math.random());
		guessCount = 0;
	}

	protected String checkGuess(int guess) {
		status="inprogress";
		guessCount++;
		if (guess < randomNumber)
			return "too low";
		if (guess > randomNumber)
			return "too high";
		if (guess == randomNumber)
			return "correct";
		status="hasresult";
		return "out of bounds";
		
	}

	protected int getScore() {
		status="end";
		int score=100-(10*guessCount);
		if(score<5)
			return 5;
		return score;
	}

	public String getStatus() {
		return status;
	}
}
