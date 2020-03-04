package com.techlabs.closeandflushtest;

import java.io.PrintWriter;

public class FlushTest {
	public static void main(String[] args) {
		String names[]= {"murtaza\n","khilawala"};
		PrintWriter printer=new PrintWriter(System.out);
		printer.write(names[0]);
		printer.flush();
		printer.write(names[1]);
		printer.flush();
	}
}
