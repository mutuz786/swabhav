package com.techlabs.rickguitarapp;

public class Mandolin implements Instrument{
	private String serialNumber;
	private double price;
	private MandolinSpec spec;

	public Mandolin(String serialNumber, double price, MandolinSpec spec) {
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
