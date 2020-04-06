package com.techlabs.propertytest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class OutputUsingIteratorTest {
	public static void main(String[] args) throws FileNotFoundException, IOException {
			Properties properties=new Properties();
			properties.load(new FileReader("info.property"));
			Set set=properties.entrySet();
			Iterator iterator=set.iterator();
			displayData(iterator);
	}

	private static void displayData(Iterator iterator) {
		while(iterator.hasNext()) {
			Map.Entry entry=(Map.Entry)iterator.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}
