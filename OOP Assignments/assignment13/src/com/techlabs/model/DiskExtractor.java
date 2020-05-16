package com.techlabs.model;

import java.io.*;

public class DiskExtractor implements Extractable {
	private Reader reader;

	public DiskExtractor(String fileName) {
		try {
			File file = new File(fileName);
			this.reader = new FileReader(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Reader getReader() {
		return reader;
	}
}
