package com.techlabs.model;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HelloFrame {
	public HelloFrame(String title) {
		JFrame frame = new JFrame(title);
		JLabel label=new JLabel("hello");
		JButton button1=new JButton("Click Me");
		JButton button2=new JButton("Click Here");
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				label.setText("you clicked button1");
			}
		});
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				label.setText("you clicked button2");
			}
		});
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);
		frame.add(button1);
		frame.add(button2);
		frame.pack();
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
}
