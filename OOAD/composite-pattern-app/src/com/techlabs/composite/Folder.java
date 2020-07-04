package com.techlabs.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IdiskItem {
	private String name;
	private List<IdiskItem> children;

	public Folder(String name) {
		this.name = name;
		children = new ArrayList<IdiskItem>();
	}

	@Override
	public String show(int padding) {
		String tree = name;
		for (IdiskItem child : children) {
			if (child instanceof Folder) {
				Folder folder = (Folder) child;
			}
			tree += "\n" + Lpadding(padding) + "|->" + child.show(padding + 1);
		}
		return tree;
	}

	private String Lpadding(int padding) {
		String lPadding = "";
		for (int i = 0; i < padding + 1; i++) {
			lPadding += "  ";
		}
		return lPadding;
	}

	public void addChild(IdiskItem child) {
		children.add(child);
	}
}
