package Board;

import java.util.Scanner;

public class GameTerminal {
	public static void main(String[] args) {
		Board board = new Board();
		Game game = new Game(board);
		game.initializePlayer(new Player("Murtaza"), new Player("Huzaifa"));
		ResultAnalyzer analyzer = new ResultAnalyzer(board);
		while (analyzer.analyzeResult() != Result.DRAW) {
			printBoard(board);
			System.out.print("Enter Co-ordinates:");
			Scanner scan = new Scanner(System.in);
			int location = scan.nextInt();
			try {
				game.addMark(location);
			} catch (Exception ex) {
				System.err.println(ex.getMessage());
			}
			if (analyzer.analyzeResult() == Result.WIN) {
				System.out.println(game.getCurrentPlayer().getName() + " won");
				break;
			}
		}
		System.out.println("GameOver");

	}

	private static void printBoard(Board board) {
		int count = 0;
		for (Cell cell : board.getCells()) {
			System.out.print(cell.getMark() + "\t");
			count = (count + 1) % 3;
			if (count == 0) {
				System.out.println();
			}
		}
	}
}
