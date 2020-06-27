package com.techlabs.frame;

import java.awt.*;

import javax.swing.*;

public class NameFrame {
	JFrame frame = new JFrame("Name Frame");
	JPanel panel = new JPanel();
	JLabel label = new JLabel("Name:");
	JButton button = new JButton();
	JTextField field = new JTextField("\t");

	public NameFrame() {
		System.out.println("NameFrame object created");
		panel.setLayout(new FlowLayout());
		button.addActionListener(new WelcomeFrame(this));
		button.setText("Button");
		panel.add(label);
		panel.add(field);
		frame.add(panel);
		panel.add(button);
		frame.add(panel);
		frame.setLayout(new FlowLayout());
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public String getFieldText() {
		return field.getText();
	}
}
