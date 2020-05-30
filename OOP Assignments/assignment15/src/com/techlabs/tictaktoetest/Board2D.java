package com.techlabs.tictaktoetest;

public class Board2D extends Board3D {

	public Board2D(int size) {
		super(size);
		heightSize = 1;
		initBoard();
	}

	@Override
	public void addMarker(Dimension dimension, Player player) {
		dimension.setHeight(0);
		super.addMarker(dimension, player);
	}

	@Override
	public String getStatus(Dimension dimension) {
		dimension.setHeight(0);
		return super.getStatus(dimension);
	}

	@Override
	public boolean isFull() {
		return checkIfFull(1, rowSize, columnSize);
	}

	@Override
	public boolean checkIfWin(Dimension dimension, Player player) {
		return checkThroughHeight(dimension, player);
	}
}
