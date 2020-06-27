package com.techlabs.test;

import java.util.*;
import Board.*;

public class Test {
	public static void main(String[] args) {
		Board board = new Board();
		ArrayList<Player> players = new ArrayList<Player>(2);
		players.add(new Player("Murtaza", Mark.X));
		players.add(new Player("Huzaifa", Mark.O));
		Game game = new Game(players, board, new ResultAnalyzer(board));
		while (game.getStatus() == 0) {
			System.out.print("Enter Co-ordinates:");
			Scanner scan = new Scanner(System.in);
			int location = scan.nextInt();
			try {
				game.play(location);
			} catch (Exception ex) {
				System.err.println(ex.getMessage());
			}
			if (game.getStatus() == 1) {
				System.out.println(game.getCurrentPlayer().getName() + " won");
			} else if (game.getStatus() == 2) {
				System.out.println("Its a draw");
			} else {
				continue;
			}
		}
		System.out.println("GameOver");
	}
}
