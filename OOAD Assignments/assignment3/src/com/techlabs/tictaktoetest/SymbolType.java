package com.techlabs.tictaktoetest;

public enum SymbolType {
	O, X;

	@Override
	public String toString() {
		switch (this) {
		case O:
			return "O";
		case X:
			return "X";
		default:
			break;
		}
		return null;
	}
}
