package com.techlabs.basic;
import java.util.*;
public class Warshipgame {
	public static int[] bots=new int[4];
	public static int[] array1=new int[10];
	public static int life=3;
	public static int num,guess=0;
	public static void main(String [] args) {
		boolean isalive=true,hit;
		setlocation();
		//System.out.println(Arrays.toString(bots));
		//System.out.println(life);
		while(isalive) {
			num=getnum();
			guess++;
			hit=gethit();
			if(hit && life!=0) {
				System.out.println("Hit");
			}
			if(hit && life==0) {
				System.out.println("Kill");
				System.out.println("You Have Made "+guess+" Guess");
				System.out.println(Arrays.toString(array1));
				break;
			}
			if(hit==false) {
				System.out.println("Miss");
			}
			//System.out.println(Arrays.toString(bots));
			//System.out.println(life);
			//System.out.println(guess);

		}
	}
	private static boolean gethit() {
		for(int i=0;i<bots.length;i++) {
			if(num==bots[i]) {
				for(int i1=i;i1<bots.length-1;i1++) {
					bots[i1]=bots[i1+1];
				}
				life--;
				return true;
			}
		}
		return false;
	}
	private static void setlocation() {
		int num=(int) (Math.random()*7);
		bots=new int[]{num,num+1,num+2,10};
		array1[num]=1;
		array1[num+1]=1;
		array1[num+2]=1;
		
	}
	public static int getnum() {
		System.out.println("Enter Element:");
		Scanner scan=new Scanner(System.in);
		String number=scan.nextLine();
		return Character.getNumericValue(number.charAt(0));
	}
}
