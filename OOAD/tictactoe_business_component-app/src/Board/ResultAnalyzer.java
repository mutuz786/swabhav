package Board;

public class ResultAnalyzer {
	private Board board;

	public ResultAnalyzer(Board board) {
		this.board = board;
	}

	public Result analyzeResult() {
		if (board.isFull()) {
			if (isWin()) {
				return Result.WIN;
			}
			return Result.DRAW;
		}
		if (isWin()) {
			return Result.WIN;
		}
		return Result.PROGRESS;
	}

	private boolean isWin() {
		int[][] win = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, { 0, 3, 6 }, { 1, 4, 7 }, { 2, 5, 8 }, { 0, 4, 8 },
				{ 2, 4, 6 } };
		for (int i = 0; i < 8; i++) {
			if (checkpattern(win[i][0], win[i][1], win[i][2]))
				return true;
		}
		return false;
	}

	private boolean checkpattern(int a, int b, int c) {
		if (board.getCell(a).getMark() == board.getCell(b).getMark()
				&& board.getCell(a).getMark() == board.getCell(c).getMark() && board.getCell(a).getMark() != Mark.EMPTY)
			return true;
		return false;
	}

	public Board getBoard() {
		return board;
	}
}
