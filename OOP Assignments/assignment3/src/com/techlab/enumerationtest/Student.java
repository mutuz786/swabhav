package com.techlab.enumerationtest;

public enum Student{
	murtaza("Mumbra","1997"),
	tanmay("Thane","1998"),
	pawan("Thane","1996");

	private final String location;
	private final String year;

	Student(String location,String year){
	this.location=location;
	this.year=year;
	}
	
	public String getLocation(){
	return location;
	}
	
	public String getYear(){
	return year;
	}
	
	
}