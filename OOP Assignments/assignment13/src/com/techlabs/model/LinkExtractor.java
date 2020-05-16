package com.techlabs.model;

import java.io.*;
import java.net.URL;

public class LinkExtractor implements Extractable {
	private Reader reader;

	public LinkExtractor(String link) {
		URL url;
		try {
			url = new URL(link);
			reader = new InputStreamReader(url.openStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Reader getReader() {
		return reader;
	}
}
