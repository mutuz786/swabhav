package com.techlabs.model;

public class Database {
	public void doDBOperations(ICrudable object) {
		object.create();
		object.read();
		object.update();
		object.delete();
	}

}
