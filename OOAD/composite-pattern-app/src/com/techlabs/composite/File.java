package com.techlabs.composite;

public class File implements IdiskItem {
	private String name;
	private int size;
	private String extension;

	public File(String name, int size, String extension) {
		this.name = name;
		this.size = size;
		this.extension = extension;
	}

	@Override
	public String show(int padding) {
		return name + "." + extension + "(" + size + " mb)";
	}

}
