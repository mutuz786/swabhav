package com.techlabs.tictaktoetest;

public class Board3D {
	private String[][][] tiles;
	protected int heightSize;
	protected int rowSize;
	protected int columnSize;

	public Board3D(int size) {
		this.heightSize = size;
		this.columnSize = size;
		this.rowSize = size;
		initBoard();
	}

	protected void initBoard() {
		this.tiles = new String[heightSize][rowSize][columnSize];
		int height = 0, row = 0, column = 0;
		while (height != heightSize) {
			tiles[height][row][column] = "-";
			column++;
			if (column == columnSize) {
				column = 0;
				row++;
			}
			if (row == rowSize) {
				row = 0;
				height++;
			}
		}
	}

	public void addMarker(Dimension dimension, Player player) {
		tiles[dimension.getHeight()][dimension.getRow()][dimension.getColumn()] = player.getSymbol();
	}

	public String[][][] getTiles() {
		return tiles;
	}

	public int getColumnSize() {
		return columnSize;
	}

	public int getRowSize() {
		return rowSize;
	}

	public int getHeightSize() {
		return heightSize;
	}

	public String getStatus(Dimension dimension) {
		return tiles[dimension.getHeight()][dimension.getRow()][dimension.getColumn()];
	}

	public boolean isFull() {
		return checkIfFull(heightSize, rowSize, columnSize);
	}

	protected boolean checkIfFull(int heightSize, int rowSize, int columnSize) {
		int height = 0, row = 0, column = 0;
		while (height != heightSize) {
			if (tiles[height][row][column].contains("-"))
				return false;
			column++;
			if (column == columnSize) {
				column = 0;
				row++;
			}
			if (row == rowSize) {
				row = 0;
				height++;
			}
		}
		return true;
	}

	public boolean checkIfWin(Dimension dimension, Player player) {
		boolean win = true;
		win = checkThroughHeight(dimension, player);
		if (!win) {
			win = true;
			win = checkThroughRow(dimension, player);
			if (!win) {
				win = true;
				win = checkThroughColumn(dimension, player);
			}
		}
		return win;
	}

	private boolean checkThroughColumn(Dimension dimension, Player player) {
		boolean win = true;
		for (int i = 0; i < columnSize; i++) {
			for (int j = 0; j < heightSize; j++) {
				if (tiles[dimension.getHeight()][j][i] != player.getSymbol()) {
					win = false;
					break;
				}
			}
			if (!win) {
				win = true;
				for (int j = 0; j < rowSize; j++) {
					if (tiles[j][dimension.getRow()][i] != player.getSymbol()) {
						win = false;
						break;
					}
				}
				if (!win) {
					win = true;
					for (int j = 0; j < heightSize; j++) {
						if (tiles[j][j][i] != player.getSymbol()) {
							win = false;
							break;
						}
					}
					if (!win) {
						win = true;
						for (int j = 0; j < heightSize; j++) {
							if (tiles[j][heightSize - j - 1][i] != player.getSymbol()) {
								win = false;
								break;
							}
						}
					}
				}
			}
			if (win)
				break;
		}
		return win;
	}

	private boolean checkThroughRow(Dimension dimension, Player player) {
		boolean win = true;
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < heightSize; j++) {
				if (tiles[dimension.getHeight()][i][j] != player.getSymbol()) {
					win = false;
					break;
				}
			}
			if (!win) {
				win = true;
				for (int j = 0; j < columnSize; j++) {
					if (tiles[j][i][dimension.getColumn()] != player.getSymbol()) {
						win = false;
						break;
					}
				}
				if (!win) {
					win = true;
					for (int j = 0; j < heightSize; j++) {
						if (tiles[j][i][j] != player.getSymbol()) {
							win = false;
							break;
						}
					}
					if (!win) {
						win = true;
						for (int j = 0; j < heightSize; j++) {
							if (tiles[j][i][heightSize - j - 1] != player.getSymbol()) {
								win = false;
								break;
							}
						}
					}
				}
			}
			if (win)
				break;
		}
		return win;
	}

	protected boolean checkThroughHeight(Dimension dimension, Player player) {
		boolean win = true;
		for (int i = 0; i < heightSize; i++) {
			for (int j = 0; j < rowSize; j++) {
				if (tiles[i][dimension.getRow()][j] != player.getSymbol()) {
					win = false;
					break;
				}
			}
			if (!win) {
				win = true;
				for (int j = 0; j < columnSize; j++) {
					if (tiles[i][j][dimension.getColumn()] != player.getSymbol()) {
						win = false;
						break;
					}
				}
				if (!win) {
					win = true;
					for (int j = 0; j < rowSize; j++) {
						if (tiles[i][j][j] != player.getSymbol()) {
							win = false;
							break;
						}
					}
					if (!win) {
						win = true;
						for (int j = 0; j < rowSize; j++) {
							if (tiles[i][j][rowSize - j - 1] != player.getSymbol()) {
								win = false;
								break;
							}
						}
					}
				}
			}
			if (win)
				break;
		}
		return win;
	}
}