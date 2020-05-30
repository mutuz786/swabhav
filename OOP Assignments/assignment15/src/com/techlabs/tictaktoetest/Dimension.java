package com.techlabs.tictaktoetest;

public class Dimension {
	private int height;
	private int row;
	private int column;

	public Dimension(int height, int row, int column) {
		this.height = height;
		this.row = row;
		this.column = column;
	}

	public Dimension(int row, int column) {
		this.height = 0;
		this.row = row;
		this.column = column;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getRow() {
		return row;
	}

	public int getHeight() {
		return height;
	}

	public int getColumn() {
		return column;
	}

}
