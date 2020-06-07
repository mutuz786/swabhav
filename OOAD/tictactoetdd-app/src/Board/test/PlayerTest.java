package Board.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Board.Player;

class PlayerTest {
	Player player;

	@BeforeEach
	void init() {
		player = new Player("murtaza");
	}

	@Test
	void shouldHaveAConstructorWhichTakeStringNameAsAParameter() {
		String expected = "murtaza";
		String actual = player.getName();
		assertEquals(expected, actual);
	}

}
