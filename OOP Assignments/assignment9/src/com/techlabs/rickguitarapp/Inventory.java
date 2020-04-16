package com.techlabs.rickguitarapp;

import java.util.*;

public class Inventory {
	private List<Guitar> guitars=new LinkedList<Guitar>();
	private List<Guitar> matchedGuitar=new LinkedList<Guitar>();

	public void addInventory(String serialNumber, double price, String model, int numString, Builder builder, Type type,
			Wood backWood, Wood frontWood) {
		Guitar guitar = new Guitar(serialNumber, price,
				new GuitarSpec(model, numString, builder, type, backWood, frontWood));
		guitars.add(guitar);
	}

	public Guitar getGuitar(String serialNumber) {
		for(Guitar guitar:guitars) {
			if(guitar.getSeialNumber()==serialNumber)
				return guitar;
		}
		return null;
	}

	public List<Guitar> search(GuitarSpec requirement){
		for(Guitar guitar:guitars) {
			if(requirement.matches(guitar.getSpec()))
				matchedGuitar.add(guitar);
		}
		return matchedGuitar;
	}
}
