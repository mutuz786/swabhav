package com.techlabs.model;

public class Boy implements IEmotionable, IMannerable {

	@Override
	public void cry() {
		System.out.println("boy is crying");
	}

	@Override
	public void laugh() {
		System.out.println("boy is laughing");
	}

	@Override
	public void wish() {
		System.out.println("boy is wishing");
	}

	@Override
	public void depart() {
		System.out.println("boy is departing");
	}

}
