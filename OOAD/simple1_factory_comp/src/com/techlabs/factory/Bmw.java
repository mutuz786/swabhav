package com.techlabs.factory;

class Bmw implements IAuto {

	@Override
	public void start() {
		System.out.println("BMW is starting");
	}

	@Override
	public void stop() {
		System.out.println("BMW is stopping");
	}

}
