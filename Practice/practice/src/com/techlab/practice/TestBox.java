package com.techlab.practice;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TestBox {
	public static String text="";
	public static void main(String[] args) {
		Frame frame=new Frame("Test");
		final TextField label=new TextField(text);
		label.setBounds(10, 10, 380, 80);
		
		Button button=new Button("close");
		button.setBounds(100, 100, 200, 50);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		ArrayList<Button> buttons=new ArrayList<Button>();
		for(Integer i=0;i<=9;i++) {
			buttons.add(new Button(i.toString()));
			String add=i.toString();
			buttons.get(i).addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					text=text.concat(add);
					label.setText(text);
				}
			});
		}
		int index=9;
		for(int y=140;y<=340;y+=100) {
			for(int x=10;x<=210;x+=100) {
				buttons.get(index).setBounds(x, y, 100, 100);
				index--;
			}
		}	
		
		
		frame.add(button);
		frame.add(label);
		for(Button button1:buttons) {
			frame.add(button1);
		}
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
}
