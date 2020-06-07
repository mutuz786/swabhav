package Board.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import Board.Cell;
import Board.Mark;

class CellTest {
	Cell cell;

	@BeforeEach
	public void init() {
		cell = new Cell();
	}

	@Test
	void shouldHaveAConstructorThatSetsInitValueOfMarkToEMPTY() {
		Mark expected = Mark.EMPTY;
		Mark actual = cell.getMark();
		assertEquals(expected, actual);
	}

	@Test
	void shouldHaveAGetterMethodForMark() {
		Mark expected = Mark.EMPTY;
		Mark actual = cell.getMark();
		assertEquals(expected, actual);
	}

	@Test
	void souldHaveAnAddMarkMethodWithParameterMarkToAddNewMark() {
		cell.addMark(Mark.X);
		Mark expected = Mark.X;
		Mark actual = cell.getMark();
		assertEquals(expected, actual);
	}

	@Test
	void addMarkMethodShouldNotOverWriteIfMarkIsNotEmpty() {
		cell.addMark(Mark.X);
		cell.addMark(Mark.O);
		Mark expected = Mark.X;
		Mark actual = cell.getMark();
		assertEquals(expected, actual);
	}
}
