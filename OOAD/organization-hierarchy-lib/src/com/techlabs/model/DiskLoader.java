package com.techlabs.model;

import java.io.*;
import java.util.*;

public class DiskLoader implements Iloader {
	Map<Integer, Employee> employees;

	public DiskLoader(String directory) {
		DataBaseManager manager = new DataBaseManager();
		try {
			employees = manager.extract(new FileReader(new File(directory)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Map<Integer, Employee> getEmpList() {
		return employees;
	}

}
