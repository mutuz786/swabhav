package com.techlabs.tictaktoetest;

import java.util.*;

public class PlayerDataBase {
	private List<Player> players = new ArrayList<Player>();

	public PlayerDataBase(Player player1, Player player2) {
		player1.setSymbol(SymbolType.X);
		player2.setSymbol(SymbolType.O);
		players.add(player1);
		players.add(player2);
	}

	public Player getPlayer(int pointer) {
		return players.get(pointer);
	}

	public int getSize() {
		return players.size();
	}

}
