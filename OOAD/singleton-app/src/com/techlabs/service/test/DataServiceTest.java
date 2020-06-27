package com.techlabs.service.test;

import com.techlabs.service.DataService;

public class DataServiceTest {
	public static void main(String[] args) {
		DataService sv1 = DataService.getInstance();
		DataService sv2 = DataService.getInstance();
		sv1.doSomething();
		sv2.doSomething();
	}
}
