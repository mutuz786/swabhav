package com.techlabs.model;

import java.util.ArrayList;

public class GameTerminal extends Input {

	public int requestGuess() {
		System.out.print("Guess A Number:");
		return takeInput();
	}

	public void outOfBounds() {
		System.out.println("Enter Between 1-100");
	}

	public void missed(String difference) {
		System.out.println("You guessed too " + difference);
	}

	public void congratulate(ArrayList<Integer> attempts) {
		System.out.println("You won the game\nAnd you made these guesses:");
		for (Integer attempt : attempts) {
			System.out.print(attempt);
		}
	}

	public int getchoice() {
		System.out.println("\n1.Play Again\t2.Exit\nWhat will you do?");
		return takeInput();
	}
}
