package com.techlabs.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class NumberTestCases {

	@Test
	void test_getOddNumber_withInput6_return3OddNumbers() {
		ArrayList<Integer> expectedOddList=new ArrayList<Integer>();
		OddNumbers oddNum=new OddNumbers(6);
		expectedOddList.add(1);
		expectedOddList.add(3);
		expectedOddList.add(5);
		ArrayList<Integer> actualOddList=oddNum.getNumber();
		assertEquals(expectedOddList,actualOddList);
	}
	
	@Test
	void test_getEvenNumber_withInput6_return4EvenNumbers() {
		ArrayList<Integer> expectedEvenList=new ArrayList<Integer>();
		EvenNumbers evenNum=new EvenNumbers(6);
		expectedEvenList.add(0);
		expectedEvenList.add(2);
		expectedEvenList.add(4);
		expectedEvenList.add(6);
		ArrayList<Integer> actualEvenList=evenNum.getNumber();
		assertEquals(expectedEvenList,actualEvenList);
	}

}
