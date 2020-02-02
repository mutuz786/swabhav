package magic_number_program;

import java.util.Scanner;

public class TestMagicNumber2 {
	public static void main(String[] args) {
		System.out.println("Enter The Number Range:");
		Scanner scan=new Scanner(System.in);
		int range=scan.nextInt();
		System.out.println("The Following Are The Magic Number:");
		for(int i=0;i<=range;i++) {
			if(i%9==1)
				System.out.print(i+"\t");
		}
	}
}
