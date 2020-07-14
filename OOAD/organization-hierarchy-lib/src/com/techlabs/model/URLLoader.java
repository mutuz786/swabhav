package com.techlabs.model;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.Map;

public class URLLoader implements Iloader {
	Map<Integer, Employee> employees;

	public URLLoader(String link) {
		DataBaseManager manager = new DataBaseManager();
		try {
			URL url = new URL(link);
			employees = manager.extract(new InputStreamReader(url.openStream()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Map<Integer, Employee> getEmpList() {
		return employees;
	}

}
