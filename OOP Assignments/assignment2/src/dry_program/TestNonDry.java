package dry_program;

import java.util.Scanner;

public class TestNonDry {
	public static void main(String[] args) {
		Student stud1 = new Student();
		stud1.getName();
		stud1.getMarks();
		stud1.setDetails();
		
		Student stud2 = new Student();
		stud2.getName();
		stud2.getMarks();
		stud2.setDetails();
		
		Student stud3 = new Student();
		stud3.getName();
		stud3.getMarks();
		stud3.setDetails();
		
		Student stud4 = new Student();
		stud4.getName();
		stud4.getMarks();
		stud4.setDetails();
	}
}

class Student {
	static String name;
	static int marks;
	static double percentage;

	public static void getName() {
		System.out.println("Student Name:");
		Scanner obj = new Scanner(System.in);
		name = obj.nextLine();
	}

	public static void getMarks() {
		System.out.println("Total Marks(out of 500):");
		Scanner obj = new Scanner(System.in);
		marks = obj.nextInt();
	}

	public static void setDetails() {
		percentage = marks * 0.20;
		System.out.println("Percentage:" + percentage);
	}

}
