package com.techlabs.rickguitarapp;

import java.util.*;

public class Inventory {
	private List<Instrument> instruments = new LinkedList<Instrument>();
	private List<Instrument> matchedInstruments = new LinkedList<Instrument>();

	public void addInventory(String serialNumber, double price, InstrumentSpec spec) {
		if (spec instanceof GuitarSpec) {
			instruments.add(new Guitar(serialNumber, price, (GuitarSpec) spec));
		}
		if (spec instanceof MandolinSpec) {
			instruments.add(new Mandolin(serialNumber, price, (MandolinSpec) spec));
		}
	}

	public Instrument getGuitar(String serialNumber) {
		for (Instrument instrument : instruments) {
			if (instrument.getSeialNumber() == serialNumber)
				return instrument;
		}
		return null;
	}

	public List<Instrument> search(InstrumentSpec requirement) {
		for (Instrument instrument : instruments) {
			if (requirement.matches(instrument.getSpec()))
				matchedInstruments.add(instrument);
		}
		return matchedInstruments;
	}

	public List<Instrument> getInstruments() {
		return instruments;
	}
}
