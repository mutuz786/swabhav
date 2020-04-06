package com.techlabs.propertytest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class OutputUsingForLoopTest {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String[] keys= {"id","name","age"};
		Properties properties=new Properties();
		properties.load(new FileReader("info.property"));
		for(String key:keys) {
			System.out.println(key+":"+properties.getProperty(key));
		}
	}
}
