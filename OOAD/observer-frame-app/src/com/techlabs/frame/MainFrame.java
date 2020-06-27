package com.techlabs.frame;

import java.awt.*;

import javax.swing.*;

public class MainFrame extends JFrame{
	public static void main(String[] args) {
		JFrame frame = new JFrame("Publisher");
		JButton button = new JButton("Place order");
		button.addActionListener(new EmailListner());
		button.addActionListener(new SmsListner());
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(button);
		frame.setSize(300, 200);
		frame.setVisible(true);
	}

}
