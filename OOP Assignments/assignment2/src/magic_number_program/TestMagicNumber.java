package magic_number_program;

import java.util.Scanner;

public class TestMagicNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		getResult(number);
	}

	private static void getResult(int number1) {
		int number=number1;
		int sum=0;
		while(true) {
			if(number==0)
				break;
			sum+=(number%10);
			number=number/10;
		}
		if(sum>9)
			getResult(sum);
		else if(sum<9){
			if(sum==1) {
				System.out.println("The Number Is Magic Number");
			}
			else if(sum!=1) {
				System.out.println("The Number Is Not A Magic Number");
			}
		}
	}
	
}

