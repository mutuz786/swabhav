package com.techlabs.filewritertest;

import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {
	public static void main(String[] args) throws IOException {
		String start = "hey what is up guys my name is murtaza\n";
		FileWriter writer = new FileWriter("file.txt");

		for (int i = 0; i < 10; i++)
			write(start,writer);
	}

	private static void write(String start, FileWriter writer) throws IOException {
		writer.write(start);
		writer.flush();
	}
}
