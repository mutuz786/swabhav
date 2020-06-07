package Board;

public class Game {
	private Board board;
	private Player player1, player2;
	public boolean player1Turn = true;

	public Game(Board board) {
		this.board = board;
	}

	public void initializePlayer(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void addMark(int location) throws RuntimeException {
		if (player1Turn) {
			board.addMark(location, Mark.X);
			player1Turn = false;
		} else {
			board.addMark(location, Mark.O);
			player1Turn = true;
		}
	}

	public Player getCurrentPlayer() {
		if (!player1Turn) {
			return player1;
		}
		return player2;
	}

	public Board getBoard() {
		return board;
	}

	public Player getPlayer1() {
		return player1;
	}

	public Player getPlayer2() {
		return player2;
	}
}
