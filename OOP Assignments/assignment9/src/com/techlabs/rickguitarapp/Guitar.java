package com.techlabs.rickguitarapp;

public class Guitar {
	private String seialNumber;
	private double price;
	private GuitarSpec spec;

	public Guitar(String serialNumber, double price, GuitarSpec spec) {
		this.seialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}

	public String getSeialNumber() {
		return seialNumber;
	}

	public double getPrice() {
		return price;
	}

	public GuitarSpec getSpec() {
		return spec;
	}
}
