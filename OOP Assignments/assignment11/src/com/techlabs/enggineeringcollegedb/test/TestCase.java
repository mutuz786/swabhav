package com.techlabs.enggineeringcollegedb.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.techlabs.enggineeringcollegedb.Branch;
import com.techlabs.enggineeringcollegedb.Person;
import com.techlabs.enggineeringcollegedb.Professor;
import com.techlabs.enggineeringcollegedb.Student;

class TestCase {
	Student student;
	Professor professor;
	
	@BeforeEach
	void init() throws ParseException {
		student = new Student(Branch.COMPUTER, new Person(100, "murtaza", "03/01/1997", "mumbai"));
		professor = new Professor(10000, 1000, new Person(365, "ravikishan", "02/03/1986", "mumbai"));
	}
	
	@Test
	void test_calculateSalaryMethod_ReturnVale121000() {
		double actual=professor.calculateSalary();
		double expected=121000;
		assertEquals(expected, actual);
	}
	
	@Test
	void test_getBranchMethod_ReturnComputer() {
		String actual=student.getBranch();
		String expected="computer";
		assertEquals(expected, actual);
	}
}
