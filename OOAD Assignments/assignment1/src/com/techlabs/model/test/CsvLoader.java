package com.techlabs.model.test;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

import com.techlabs.model.Employee;
import com.techlabs.model.FileManager;
import com.techlabs.model.ILoader;

public class CsvLoader implements ILoader {
	private Reader reader;
	private Collection<Employee> empList = new TreeSet<Employee>();

	public CsvLoader() {
		try {
			File file = new File("empData.csv");
			this.reader = new FileReader(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Collection<Employee> load() {
		FileManager manager = new FileManager();
		ArrayList<String> lines = (ArrayList<String>) manager.getData(reader);
		for (String line : lines) {
			addEmpData(line);
		}
		return empList;
	}

	private void addEmpData(String line) {
		String[] empData = line.split(",");
		int empId = addInteger(empData[0]);
		String name = addString(empData[1]);
		String role = addString(empData[2]);
		int managerId = addInteger(empData[3]);
		String doj = addString(empData[4]);
		int salary = addInteger(empData[5]);
		int commision = addInteger(empData[6]);
		int deptNo = addInteger(empData[7]);
		Employee employee = new Employee(empId, name, role, managerId, doj, salary, commision, deptNo);
		empList.add(employee);
	}

	private String addString(String data) {
		return data.replaceAll("'", "");
	}

	private int addInteger(String data) {
		if (data.equalsIgnoreCase("NULL"))
			return 0;
		return Integer.parseInt(data);
	}
}
