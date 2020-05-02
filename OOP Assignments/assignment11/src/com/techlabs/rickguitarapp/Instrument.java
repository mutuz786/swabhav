package com.techlabs.rickguitarapp;

public interface Instrument {
	abstract public String getSeialNumber();

	abstract public double getPrice();

	abstract public InstrumentSpec getSpec();
}
