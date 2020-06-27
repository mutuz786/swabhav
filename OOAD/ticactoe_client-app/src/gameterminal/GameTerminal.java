package gameterminal;

import java.util.*;

import Board.*;

public class GameTerminal {
	public static void main(String[] args) {
		Board board = new Board();
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(new Player("Murtaza", Mark.X));
		players.add(new Player("Huzaifa", Mark.O));
		Game game = new Game(players, board, new ResultAnalyzer(board));
		while (game.getStatus() == Result.PROGRESS) {
			System.out.print("Enter Co-ordinates:");
			Scanner scan = new Scanner(System.in);
			int location = scan.nextInt();
			try {
				game.play(location);
			} catch (Exception ex) {
				System.err.println(ex.getMessage());
			}
			if (game.getStatus() == Result.WIN) {
				System.out.println(game.getCurrentPlayer() + " won");
			}
			if (game.getStatus() == Result.DRAW) {
				System.out.println("Its a draw");
			}
		}
		System.out.println("GameOver");
	}
}
