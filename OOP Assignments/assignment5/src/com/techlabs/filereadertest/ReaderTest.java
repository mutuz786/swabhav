package com.techlabs.filereadertest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {
	public static void main(String[] args) throws IOException {
		String text = "";
		int ascii;
		FileReader reader = null;

		try {
			reader = new FileReader("file.txt");
		} catch (FileNotFoundException fe) {
			System.out.println("File Not Found");
		}

		while ((ascii = reader.read()) != -1) {
			text = text + ((char) ascii);
		}
		System.out.println(text);
	}
}
