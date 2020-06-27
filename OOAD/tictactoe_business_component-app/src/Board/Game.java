package Board;

import java.util.ArrayList;

public class Game {
	private Board board;
	private Player currentPlayer, nextPlayer;
	ResultAnalyzer analyzer;
	Result status;
	String validSymbol;

	public Game(ArrayList<Player> players, Board board, ResultAnalyzer analyzer) {
		if (players.size() == 2) {
			this.currentPlayer = players.get(0);
			this.nextPlayer = players.get(1);
		}
		this.board = board;
		this.analyzer = analyzer;
		this.status = analyzer.analyzeResult();
	}

	public void play(int location) throws RuntimeException {
		if (location > 8 || location < 0) {
			throw new RuntimeException("Invalid input");
		}
		if (board.getCell(location).getMark() == Mark.EMPTY && status == Result.PROGRESS) {
			board.addMark(location, currentPlayer.getMark());
			validSymbol=currentPlayer.getMark().toString();
			status = analyzer.analyzeResult();
			if (status == Result.PROGRESS) {
				Player tempPlayer = currentPlayer;
				currentPlayer = nextPlayer;
				nextPlayer = tempPlayer;
			}
		}
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public Board getBoard() {
		return board;
	}

	public Player getNextPlayer() {
		return nextPlayer;
	}

	public int getStatus() {
		if (status == Result.WIN)
			return 1;
		if (status == Result.DRAW)
			return 2;
		return 0;
	}

	public ResultAnalyzer getAnalyzer() {
		return analyzer;
	}
	public String getValidSymbol() {
		return validSymbol;
	}
}
