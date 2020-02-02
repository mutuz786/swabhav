package for_loop_program;

public class TestEnhancedForLoop {
	public static void main(String[] args) {
		int[] numArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] numArray2=new int[9];
		int index=8;
		System.out.println("Array Before Reverse:");
		for (int number : numArray)
			System.out.print(number + "\t");
		for (int number:numArray) {
			numArray2[index]= number;
			index--;
		}
		System.out.println("\nArray After Reverse:");
		for (int number : numArray2)
			System.out.print(number + "\t");
	}
}
