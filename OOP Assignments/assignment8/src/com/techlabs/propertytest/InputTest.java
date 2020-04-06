package com.techlabs.propertytest;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class InputTest {
	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		properties.setProperty("id", "101");
		properties.setProperty("name", "murtaza");
		properties.setProperty("age", "23");
		properties.store(new FileWriter("info.property") , "new update");

	}
}
