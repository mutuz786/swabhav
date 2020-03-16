package com.techlab.practice;

import java.awt.*;
import java.awt.event.*;

public class Calculator {
	public static String text="";
	public static void main(String[] args) {
		Frame field = new Frame("Button Example");
		final TextField label = new TextField(text);
		label.setBounds(10, 40, 400, 100);

		Button close = new Button("Close");
		close.setBounds(310, 540, 100, 100);
		Button clear = new Button("Clear");
		clear.setBounds(210, 540, 100, 100);
		Button zero = new Button("0");
		zero.setBounds(110, 440, 100, 100);
		Button one = new Button("1");
		one.setBounds(10, 340, 100, 100);
		Button two = new Button("2");
		two.setBounds(110, 340, 100, 100);
		Button three = new Button("3");
		three.setBounds(210, 340, 100, 100);
		Button four = new Button("4");
		four.setBounds(10, 240, 100, 100);
		Button five = new Button("5");
		five.setBounds(110, 240, 100, 100);
		Button six = new Button("6");
		six.setBounds(210, 240, 100, 100);
		Button seven = new Button("7");
		seven.setBounds(10, 140, 100, 100);
		Button eight = new Button("8");
		eight.setBounds(110, 140, 100, 100);
		Button nine = new Button("9");
		nine.setBounds(210, 140, 100, 100);
		Button dot = new Button(".");
		dot.setBounds(10, 440, 100, 100);
		Button plus = new Button("+");
		plus.setBounds(310, 140, 100, 100);
		Button minus = new Button("-");
		minus.setBounds(310, 240, 100, 100);
		Button multiply = new Button("*");
		multiply.setBounds(310, 340, 100, 100);
		Button divide = new Button("/");
		divide.setBounds(310, 440, 100, 100);
		Button equal = new Button("=");
		equal.setBounds(210, 440, 100, 100);


		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text="";
				label.setText(text);
			}
		});
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = text + "0";
				label.setText(text);
			}
		});
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = text + "1";
				label.setText(text);
			}
		});
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = text + "2";
				label.setText(text);
			}
		});
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = text + "3";
				label.setText(text);
			}
		});
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = text + "4";
				label.setText(text);
			}
		});
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = text + "5";
				label.setText(text);
			}
		});
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = text + "6";
				label.setText(text);
			}
		});
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = text + "7";
				label.setText(text);
			}
		});
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = text + "8";
				label.setText(text);
			}
		});
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = text + "9";
				label.setText(text);
			}
		});
		dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = text + ".";
				label.setText(text);
			}
		});
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = text + "+";
				label.setText(text);
			}
		});
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = text + "-";
				label.setText(text);
			}
		});
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = text + "*";
				label.setText(text);
			}
		});
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = text + "/";
				label.setText(text);
			}
		});
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double answer=Calculate.calculateAnswer(text);
				text = answer.toString();
				label.setText(text);
			}
		});

		field.add(close);
		field.add(clear);
		field.add(label);
		field.add(zero);
		field.add(one);
		field.add(two);
		field.add(three);
		field.add(four);
		field.add(five);
		field.add(six);
		field.add(seven);
		field.add(eight);
		field.add(nine);
		field.add(dot);
		field.add(plus);
		field.add(minus);
		field.add(multiply);
		field.add(divide);
		field.add(equal);
		
		field.setSize(420, 650);
		field.setLayout(null);
		field.setVisible(true);
	}
}