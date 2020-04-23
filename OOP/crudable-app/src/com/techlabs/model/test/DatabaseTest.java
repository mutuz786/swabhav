package com.techlabs.model.test;

import com.techlabs.model.*;

public class DatabaseTest {
	public static void main(String[] args) {
		Database dataBase=new Database();
		dataBase.doDBOperations(new AddressDB());
		dataBase.doDBOperations(new OrderDB());
		dataBase.doDBOperations(new CustomerDB());
	}
}
