package Board.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Board.Board;
import Board.Mark;

class BoardTest {
	Board board;

	@BeforeEach
	void init() {
		board = new Board();
	}

	@Test
	void shouldHaveAConstructorWhichInitializesTheArrayOf9Cell() {
		int expected = 9;
		int actual = board.getCells().length;
		assertEquals(expected, actual);
	}

	@Test
	void shouldHaveAnAddMarkMethodToMarkACellOfGivenPositionAndMark() {
		board.addMark(4, Mark.X);
		Mark expected = Mark.X;
		Mark actual = board.getCells()[4].getMark();
		assertEquals(expected, actual);
	}

	@Test
	void shouldHaveAnGetCellMethodToGetCellOfACellArrayOfGivenPosition() {
		board.addMark(4, Mark.X);
		Mark expected = Mark.X;
		Mark actual = board.getCell(4).getMark();
		assertEquals(expected, actual);
	}
	@Test
	void shouldHaveAIsFullMethodToCheckIfCellArrayIsFullOfXAndO() {
		for(int i=0;i<9;i++) {
			board.addMark(i, Mark.X);
		}
		boolean expected = true;
		boolean actual = board.isFull();
		assertEquals(expected, actual);
	}
	@Test
	void shouldHaveAIsFullMethodToCheckIfCellArrayIsNotFull() {
		boolean expected = false;
		boolean actual = board.isFull();
		assertEquals(expected, actual);
	}
}
