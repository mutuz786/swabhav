package com.techlabs.tictaktoetest;

public class Game {
	private Board3D board;
	PlayerDataBase playersDB;
	private int pointer;
	private Player winner = null;
	private final int LOWER_LIMIT = 0;

	public Game(Board3D board, PlayerDataBase playersDB) {
		this.board = board;
		this.playersDB = playersDB;
	}

	public Player getCurrentPlayer() {
		return playersDB.getPlayer(pointer);
	}

	public void addMark(Dimension dimension) {
		int height = dimension.getHeight();
		int row = dimension.getRow();
		int column = dimension.getColumn();
		if (board.getStatus(dimension) == "-" && !(height >= board.getHeightSize()) && !(row >= board.getRowSize())
				&& !(column >= board.getColumnSize()) && height >= LOWER_LIMIT && row >= LOWER_LIMIT
				&& column >= LOWER_LIMIT) {
			board.addMarker(dimension, playersDB.getPlayer(pointer));
			if ((board.checkIfWin(dimension, playersDB.getPlayer(pointer)))) {
				winner = playersDB.getPlayer(pointer);
			}
			pointer = (pointer + 1) % playersDB.getSize();
		} else
			System.err.println("wrong input");
	}

	public Player getWinner() {
		return winner;
	}

}
