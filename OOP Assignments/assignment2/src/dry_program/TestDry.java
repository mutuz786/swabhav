package dry_program;

import java.util.Scanner;

public class TestDry {
	static String[] names = new String[4];
	static int[] marks = new int[4];
	static float[] percentage = new float[4];

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Student Name:");
			names[i] = scan.nextLine();
			System.out.print("Marks(out of 500):");
			marks[i] = scan.nextInt();
			percentage[i] = (float) (marks[i] * 0.20);
			System.out.print("Percentage:" + percentage[i] + "\n");
		}

	}
}
