package com.techlabs.rickguitarapp;

public class Guitar implements Instrument {
	private String serialNumber;
	private double price;
	private GuitarSpec spec;

	public Guitar(String serialNumber, double price, GuitarSpec spec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}

	@Override
	public String getSeialNumber() {
		return serialNumber;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public InstrumentSpec getSpec() {
		return spec;
	}
}
