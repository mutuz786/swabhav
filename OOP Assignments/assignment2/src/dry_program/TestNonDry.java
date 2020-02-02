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
		Scanner scan = new Scanner(System.in);
		name = scan.nextLine();
	}

	public static void getMarks() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Total Marks(out of 500):");
			int proxyCheck = scan.nextInt();
			if (proxyCheck > 0 && proxyCheck <= 500) {
				marks = proxyCheck;
				break;
			} else
				System.out.println("Enter correct Info");
		}

	}

	public static void setDetails() {
		percentage = marks * 0.20;
		System.out.println("Percentage:" + percentage);
	}

}
