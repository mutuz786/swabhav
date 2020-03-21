package com.techlabs.model.test;

import com.techlabs.model.Player;

public class PlayerTest {
	public static void main(String[] args) {
		Player sachin = new Player(115, "Sachin", 45);
		Player virat = new Player(145, "Virat");
		printInfo(sachin);
		printInfo(virat);
		Player temp=sachin.whoIsElder(virat);
		System.out.println(temp.getName());

		System.out.println(sachin.hashCode());
		System.out.println(virat.hashCode());
		System.out.println(temp.hashCode());
	}

	private static void printInfo(Player player) {
		System.out.println(player.getId()+" "+player.getName()+" "+player.getAge()+"\n");
	}
}
