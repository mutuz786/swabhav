package com.techlab.practice;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Calculator {
	public static String text = "";

	public static void main(String[] args) {
		Character[] characters = { '7', '8', '9', '/', '4', '5', '6', '*', '1', '2', '3', '+', '.', '0', '=', '-' ,'(',')'};
		Frame field = new Frame("Button Example");
		final TextField label = new TextField(text);
		label.setBounds(10, 40, 400, 100);

		Button close = new Button("Close");
		close.setBounds(310, 540, 100, 100);
		Button clear = new Button("Clear");
		clear.setBounds(210, 540, 100, 100);
		ArrayList<Button> buttons = new ArrayList<Button>();
		int index = 0;
		for (Character character : characters) {
			buttons.add(new Button(character.toString()));
			buttons.get(index).addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (character != '=') {
						text = text.concat(character.toString());
						label.setText(text);
					}
					else if(character=='=') {
						Double answer=Calculate.calculateAnswer(text);
						text=answer.toString();
						label.setText(text);
					}
				}
			});
			index++;
		}
		int ind = 0;
		for (int y = 140; y <= 540; y += 100) {
			for (int x = 10; x <= 310; x += 100) {
				buttons.get(ind).setBounds(x, y, 100, 100);
				ind++;
				if(ind==buttons.size())
					break;
			}
		}
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = "";
				label.setText(text);
			}
		});

		field.add(close);
		field.add(clear);
		field.add(label);
		for (Button button1 : buttons) {
			field.add(button1);
		}
		field.setSize(420, 650);
		field.setLayout(null);
		field.setVisible(true);
	}
}