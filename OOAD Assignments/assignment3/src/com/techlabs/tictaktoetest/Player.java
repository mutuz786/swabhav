package com.techlabs.tictaktoetest;

public class Player {
	private String name;
	private String symbol;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(SymbolType symbol) {
		this.symbol = symbol.toString();
	}

}
