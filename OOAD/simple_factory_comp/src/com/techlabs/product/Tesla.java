package com.techlabs.product;

class Tesla implements IAuto {

	@Override
	public void start() {
		System.out.println("Tesla is starting");
	}

	@Override
	public void stop() {
		System.out.println("Tesla is stopping");
	}

}
