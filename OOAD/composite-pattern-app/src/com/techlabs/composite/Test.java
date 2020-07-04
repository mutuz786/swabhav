package com.techlabs.composite;

public class Test {
	public static void main(String[] args) {
		Folder root = new Folder("Movies");
		root.addChild(new File("abc", 700, "avi"));
		Folder action = new Folder("Action");
		Folder adventure = new Folder("Adventure");
		adventure.addChild(new Folder("Sci-fi"));
		adventure.addChild(new File("mno", 39, "avi"));
		action.addChild(adventure);
		action.addChild(new File("lmn", 60, "avi"));
		root.addChild(action);
		root.addChild(new File("pqr", 250, "avi"));
		System.out.println(root.show(0));
	}
}
