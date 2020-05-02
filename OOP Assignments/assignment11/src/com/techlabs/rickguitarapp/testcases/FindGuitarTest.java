package com.techlabs.rickguitarapp.testcases;

import java.util.*;

import com.techlabs.rickguitarapp.Builder;
import com.techlabs.rickguitarapp.Instrument;
import com.techlabs.rickguitarapp.InstrumentSpec;
import com.techlabs.rickguitarapp.GuitarSpec;
import com.techlabs.rickguitarapp.Inventory;
import com.techlabs.rickguitarapp.MandolinSpec;
import com.techlabs.rickguitarapp.Style;
import com.techlabs.rickguitarapp.Type;
import com.techlabs.rickguitarapp.Wood;

public class FindGuitarTest {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		inventory.addInventory("100", 7892.87,
				new GuitarSpec("gtx09", 10, Builder.COLLINGS, Type.ACCOUSTIC, Wood.ADIRONDACK, Wood.ADIRONDACK));
		inventory.addInventory("101", 54329.63,
				new GuitarSpec("gt-82", 12, Builder.MARTIN, Type.ELECTRIC, Wood.BRAZILIAN_ROSEWOOD, Wood.MAPLE));
		inventory.addInventory("102", 82724.54,
				new GuitarSpec("straga", 7, Builder.COLLINGS, Type.ACCOUSTIC, Wood.COCOBOLO, Wood.INDIAN_ROSEWOOD));
		inventory.addInventory("103", 65223.32,
				new GuitarSpec("yts-82", 7, Builder.COLLINGS, Type.ACCOUSTIC, Wood.COCOBOLO, Wood.INDIAN_ROSEWOOD));
		inventory.addInventory("105", 82463.42,
				new MandolinSpec("c-19", Style.A, Builder.GIBSON, Type.ELECTRIC, Wood.ALDER, Wood.CEDAR));

		Instrument instrument = inventory.getGuitar("101");
		System.out.println("Guitar with the serial number 101 is model " + instrument.getSpec().getModel());

		InstrumentSpec requirement = new GuitarSpec("", 7, Builder.COLLINGS, Type.ACCOUSTIC, Wood.COCOBOLO,
				Wood.INDIAN_ROSEWOOD);
		List<Instrument> instruments = inventory.search(requirement);
		printInfo(instruments);
	}

	private static void printInfo(List<Instrument> instruments) {
		if (!isEmpty(instruments)) {
			for (Instrument guitar : instruments) {
				System.out.println("Serial Number:" + guitar.getSeialNumber() + "\nModel:" + guitar.getSpec().getModel()
						+ "\nPrice:" + guitar.getPrice() + "\n");
			}
		}
	}

	private static boolean isEmpty(List<Instrument> instruments) {
		if (instruments == null) {
			System.out.println("No match found");
			return true;
		}
		return false;
	}
}
