package com.techlabs.service;

public class DataService {
	private static DataService bucket;

	private DataService() {
		System.out.println("Inside Data Service");
	}

	public static DataService getInstance() {
		if (bucket == null) {
			bucket = new DataService();
		}
		return bucket;
	}

	public void doSomething() {
		System.out.println("work done by " + this.hashCode());
	}
}
