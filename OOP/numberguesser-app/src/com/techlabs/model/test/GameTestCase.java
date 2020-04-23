package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.model.Game;

class GameTestCase {
	Game game=new Game();
	@Test
	void test_checkGuessMethod_withOutOfBoundInput() {
		game.gameInit();
		String expectedOutcome="out of bounds";
		String actualOutcome=game.checkGuess(-1);
		assertEquals(expectedOutcome, actualOutcome);
		actualOutcome=game.checkGuess(101);
		assertEquals(expectedOutcome, actualOutcome);
	}
	@Test
	void test_checkGuessMethod_withHighInput() {
		game.gameInit();
		String expectedOutcome="too high";
		String actualOutcome=game.checkGuess(game.getRandomNumber()+1);
		assertEquals(expectedOutcome, actualOutcome);
	}
	@Test
	void test_checkGuessMethod_withLowInput() {
		game.gameInit();
		String expectedOutcome="too low";
		String actualOutcome=game.checkGuess(game.getRandomNumber()-1);
		assertEquals(expectedOutcome, actualOutcome);
	}
	@Test
	void test_checkGuessMethod_withRightInput() {
		game.gameInit();
		String expectedOutcome="correct";
		String actualOutcome=game.checkGuess(game.getRandomNumber());
		assertEquals(expectedOutcome, actualOutcome);
	}
	


}
