package com.techlabs.tictaktoetest;

import java.util.Scanner;

public class GameTerminal {
	static Board3D board;
	static Game game;

	public static void main(String[] args) {
		board = new Board3D(3);
		PlayerDataBase playersDB = new PlayerDataBase(new Player("Murtaza"), new Player("Huzaifa"));
		game = new Game(board, playersDB);
		printBoard();
		System.out.println("Enter co-ordinate(row,column)");
		while (game.getWinner() == null && !board.isFull()) {
			System.out.println(game.getCurrentPlayer().getName() + ":");
			Scanner sc = new Scanner(System.in);
			int height = sc.nextInt();
			int row = sc.nextInt();
			int column = sc.nextInt();
			game.addMark(new Dimension(height, row, column));
			printBoard();
			if (game.getWinner() != null) {
				System.out.println(game.getWinner().getName() + " won");
				break;
			}
		}
		System.out.println("GameOver");
	}

	private static void printBoard() {
		int height = 0, row = 0, column = 0;
		int heightSize = board.getHeightSize();
		int rowSize = board.getRowSize();
		int columnSize = board.getColumnSize();

		String[][][] tiles = board.getTiles();
		while (row != rowSize) {
			System.out.print(tiles[height][row][column] + "\t");
			column++;
			if (column == columnSize) {
				column = 0;
				height++;
				System.out.print("\t");
			}
			if (height == heightSize) {
				height = 0;
				row++;
				System.out.println();
			}
		}

	}
}
