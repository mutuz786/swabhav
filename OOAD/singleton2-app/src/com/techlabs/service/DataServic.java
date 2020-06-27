package com.techlabs.service;

public class DataServic {
	private static DataServic bucket;

	private DataServic() {
		System.out.println("Inside Data Service");
	}

	public static DataServic getInstance() {
		if (bucket == null) {
			bucket = new DataServic();
		}
		return bucket;
	}

	public void doSomething() {
		System.out.println("work done by " + this.hashCode());
	}
}
