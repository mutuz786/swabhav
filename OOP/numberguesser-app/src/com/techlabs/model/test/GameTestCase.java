package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.techlabs.model.Game;

class GameTestCase {
	static int count=0;
	
	@Before
	private Game setup() {
		return new Game();
	}
	
	@AfterEach
	void end() {
		System.out.println("end of test "+getcount());
	}
	
	private static int getcount() {
		count++;
		return count;
	}

	@Test
	void test_checkGuessMethod_withOutOfBoundInput() {
		Game game = setup();
		game.gameInit();
		String expectedOutcome = "out of bounds";
		String actualOutcome = game.checkGuess(-1);
		assertEquals(expectedOutcome, actualOutcome);
		actualOutcome = game.checkGuess(101);
		assertEquals(expectedOutcome, actualOutcome);
	}

	@Test
	void test_checkGuessMethod_withHighInput() {
		Game game = setup();
		game.gameInit();
		String expectedOutcome = "too high";
		String actualOutcome = game.checkGuess(game.getRandomNumber() + 1);
		assertEquals(expectedOutcome, actualOutcome);
	}

	@Test
	void test_checkGuessMethod_withLowInput() {
		Game game = setup();
		game.gameInit();
		String expectedOutcome = "too low";
		String actualOutcome = game.checkGuess(game.getRandomNumber() - 1);
		assertEquals(expectedOutcome, actualOutcome);
	}

	@Test
	void test_checkGuessMethod_withRightInput() {
		Game game = setup();
		game.gameInit();
		String expectedOutcome = "correct";
		String actualOutcome = game.checkGuess(game.getRandomNumber());
		assertEquals(expectedOutcome, actualOutcome);
	}

	@Test
	void test_getScoreMethod_With1CorrectGuessInput_ReturnScore100() {
		Game game = setup();
		game.gameInit();
		game.checkGuess(game.getRandomNumber());
		int expectedOutcome = 100;
		int actualOutcome = game.getScore();
		assertEquals(expectedOutcome, actualOutcome);
	}

	@Test
	void test_getScoreMethod_With1CorrectAnd1wrongGuessInput_ReturnScore90() {
		Game game = setup();
		game.gameInit();
		game.checkGuess(game.getRandomNumber() + 1);
		game.checkGuess(game.getRandomNumber());
		int expectedOutcome = 90;
		int actualOutcome = game.getScore();
		assertEquals(expectedOutcome, actualOutcome);
	}

	@Test
	void test_getScoreMethod_With1CorrectAnd10wrongGuessInput_ReturnScore5() {
		Game game = setup();
		game.gameInit();
		for (int i = 1; i <= 10; i++)
			game.checkGuess(game.getRandomNumber() + i);
		game.checkGuess(game.getRandomNumber());
		int expectedOutcome = 5;
		int actualOutcome = game.getScore();
		assertEquals(expectedOutcome, actualOutcome);
	}

}
