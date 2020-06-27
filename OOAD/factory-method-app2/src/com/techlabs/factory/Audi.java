package com.techlabs.factory;

class Audi implements IAuto {

	@Override
	public void start() {
		System.out.println("Audi is starting");
	}

	@Override
	public void stop() {
		System.out.println("Audi is stopping");
	}

}
