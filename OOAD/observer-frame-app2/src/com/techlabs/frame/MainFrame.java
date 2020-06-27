package com.techlabs.frame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame {
	public void startGUI() {
		JFrame frame = new JFrame("Publisher");
		JButton button1 = new JButton("Red");
		JButton button2 = new JButton("Green");
		button1.addActionListener(CommonListner.getInstance());
		button2.addActionListener(CommonListner.getInstance());
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(button1);
		frame.add(button2);
		frame.setSize(300, 200);
		frame.setVisible(true);
	}

}
