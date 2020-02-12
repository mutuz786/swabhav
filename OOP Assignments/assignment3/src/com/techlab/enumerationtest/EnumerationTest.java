package com.techlab.enumerationtest;

public class EnumerationTest {
	public static void main(String [] args) {
		String[] locations={"Mumbra","Panvel","Vashi"};
		for(Student name:Student.values()){
			System.out.println("Name:"+name);
			System.out.println("Location:"+name.getLocation);
			System.out.println("Birth Year:"+name.getYear);
		}
		for(String location:locations){
			for(Student name:Student.getValues()){
				if(location==name.location)
					System.out.println(name+" stays at "+location);
			}
		}
	}
}
