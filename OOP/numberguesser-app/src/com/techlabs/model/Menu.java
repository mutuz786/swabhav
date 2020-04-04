package com.techlabs.model;

public class Menu extends Input{
	void loadMenu() {
		System.out.println("What will you do?\n1.Play Again\t2.Exit");
		int choice = takeInput();
		switch (choice) {
		case 1:
			Main game=new Main();
			game.startGame();
			break;

		case 2:
			System.exit(0);
			break;

		default:
			System.out.println("Enter the correct choice");
			loadMenu();
			break;
		}

	}
}
