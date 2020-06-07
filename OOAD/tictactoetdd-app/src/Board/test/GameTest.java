package Board.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Board.*;

class GameTest {
	Game game;

	@BeforeEach
	void init() {
		game = new Game(new Board());
	}

	@Test
	void shouldHaveAConstructorWhichTakeBoardAsAParameter() {
		Board unexpected = null;
		Board actual = game.getBoard();
		assertNotEquals(unexpected, actual);
	}

	@Test
	void shouldHaveAInitMethodWhichTakeTwoPlayersAsAParameter() {
		game.initializePlayer(new Player("Murtaza"), new Player("Huzaifa"));
		Player unexpected = null;
		Player actual = game.getPlayer1();
		assertNotEquals(unexpected, actual);
		actual = game.getPlayer2();
		assertNotEquals(unexpected, actual);
	}

	@Test
	void shouldHaveAAddMarkMethodWithLocationAsAParameter() {
		game.initializePlayer(new Player("Murtaza"), new Player("Huzaifa"));
		game.addMark(2);
		game.addMark(1);
		Mark expected = Mark.X;
		Mark actual = game.getBoard().getCell(2).getMark();
		assertEquals(expected, actual);
		expected = Mark.O;
		actual = game.getBoard().getCell(1).getMark();
		assertEquals(expected, actual);
	}

	@Test
	void shouldHaveAGetCurrentPlayerMethodToGetThePlayerBeforeAddMarkSwitchedTheTurn() {
		game.initializePlayer(new Player("Murtaza"), new Player("Huzaifa"));
		game.addMark(3);
		Player expected = game.getPlayer1();
		Player actual = game.getCurrentPlayer();
		assertEquals(expected, actual);
	}
}
