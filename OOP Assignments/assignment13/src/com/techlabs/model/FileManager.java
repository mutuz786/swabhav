package com.techlabs.model;

import java.io.*;
import java.util.*;

public class FileManager {
	public Collection<String> getData(Reader reader) {
		ArrayList<String> lines = new ArrayList<String>();
		try {
			BufferedReader buffer = new BufferedReader(reader);
			String line;
			while ((line = buffer.readLine()) != null) {
				lines.add(line);
			}
			buffer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lines;
	}
}
