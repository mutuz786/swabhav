package com.techlabs.model;

import java.util.Scanner;

public class Input {
	public int takeInput() {
		try {
			Scanner scan = new Scanner(System.in);
			return scan.nextInt();
		}
		catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
		return 0;
	}
}
