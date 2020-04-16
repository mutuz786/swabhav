package com.techlabs.rickguitarapp.test;

import java.util.*;

import com.techlabs.rickguitarapp.*;

public class FindGuitarTest {
	public static void main(String[] args) {
		Inventory inventory=new Inventory();
		inventory.addInventory("100", 7892.87, "c-19", 10, Builder.FENDER, Type.ACCOUSTIC, Wood.ADIRONDACK, Wood.ALDER);
		inventory.addInventory("101", 54329.63, "gt-82", 12, Builder.MARTIN, Type.ELECTRIC, Wood.BRAZILIAN_ROSEWOOD, Wood.MAPLE);
		inventory.addInventory("102", 82724.54, "straga", 7, Builder.COLLINGS, Type.ACCOUSTIC, Wood.COCOBOLO, Wood.INDIAN_ROSEWOOD);
		inventory.addInventory("103", 65223.32, "yts-82", 7, Builder.COLLINGS, Type.ACCOUSTIC, Wood.COCOBOLO, Wood.INDIAN_ROSEWOOD);
		
		Guitar guitar=inventory.getGuitar("101");
		System.out.println("Guitar with the serial number 101 is model "+guitar.getSpec().getModel());
		
		GuitarSpec requirement=new GuitarSpec("", 7, Builder.COLLINGS, Type.ACCOUSTIC, Wood.COCOBOLO, Wood.INDIAN_ROSEWOOD);
		List<Guitar> guitars=inventory.search(requirement);
		printInfo(guitars);
	}

	private static void printInfo(List<Guitar> guitars) {
		if(!isEmpty(guitars)) {
			for(Guitar guitar:guitars) {
				System.out.println("Serial Number:"+guitar.getSeialNumber()+"\nModel:"+guitar.getSpec().getModel()+"\nPrice:"+guitar.getPrice()+"\n");
			}
		}
	}

	private static boolean isEmpty(List<Guitar> guitars) {
		if(guitars==null) {
			System.out.println("No match found");
			return true;
		}
		return false;
	}
}
