package com.techlabs.frame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class WelcomeFrame implements ActionListener {
	JFrame frame = new JFrame("Welcome Frame");
	JLabel label = new JLabel("");
	NameFrame nframe;

	public WelcomeFrame(NameFrame nframe) {
		System.out.println("WelcomeFrame object created");
		this.nframe = nframe;
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);
		frame.setSize(300, 200);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.label.setText("Welcome " + nframe.getFieldText());
		frame.setVisible(true);
	}

}
