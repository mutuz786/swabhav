package com.techlabs.service;

public enum DataService {
	INSTANCE;

	private static DataService bucket;

	private DataService() {

	}

	public static DataService getInstance() {
		if (bucket == null) {
			bucket = DataService.INSTANCE;
		}
		return bucket;
	}

	public void doSomething() {
		System.out.println("work done by " + this.hashCode());
	}

}
