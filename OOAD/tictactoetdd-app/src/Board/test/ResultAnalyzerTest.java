package Board.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Board.Board;
import Board.Mark;
import Board.Result;
import Board.ResultAnalyzer;

class ResultAnalyzerTest {
	ResultAnalyzer analyzer;
	Board board;

	@BeforeEach
	void init() {
		board = new Board();
		analyzer = new ResultAnalyzer(board);
	}

	@Test
	void shouldhaveAConstructorWithBoardParameter() {
		Board unexpected = null;
		Board actual = analyzer.getBoard();
		assertNotEquals(unexpected, actual);
	}

	@Test
	void shouldHaveAanalyzeResultToCheckResultWin() {
		board.addMark(1, Mark.X);
		board.addMark(4, Mark.X);
		board.addMark(7, Mark.X);
		Result expected = Result.WIN;
		Result actual = analyzer.analyzeResult();
		assertEquals(expected, actual);
	}

	@Test
	void shouldHaveAanalyzeResultToCheckResultProgress() {
		Result expected = Result.PROGRESS;
		Result actual = analyzer.analyzeResult();
		assertEquals(expected, actual);
	}

	@Test
	void shouldHaveAanalyzeResultToCheckResulDraw() {
		board.addMark(0, Mark.X);
		board.addMark(1, Mark.X);
		board.addMark(5, Mark.X);
		board.addMark(8, Mark.X);
		board.addMark(2, Mark.O);
		board.addMark(3, Mark.O);
		board.addMark(4, Mark.O);
		board.addMark(6, Mark.X);
		board.addMark(7, Mark.O);
		Result expected = Result.DRAW;
		Result actual = analyzer.analyzeResult();
		assertEquals(expected, actual);
	}
}
