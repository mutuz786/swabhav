package com.techlabs.model;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class NameFrame extends JFrame {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label1 = new JLabel("player 1:");
	JTextArea player1 = new JTextArea("\t");
	JLabel label2 = new JLabel("player 2:");
	JTextArea player2 = new JTextArea("\t");
	JButton button = new JButton("Done");

	public NameFrame() {
		label1.setBounds(100, 30, 400, 30);
		button.addActionListener(new GameFrame(this));
		panel.add(label1);
		panel.add(player1);
		frame.add(panel);
		panel.add(label2);
		panel.add(player2);
		frame.add(panel);
		frame.add(button);
		frame.setLayout(new FlowLayout());
		frame.setSize(500, 200);
		frame.setVisible(true);
	}

	public String getplayer1() {
		return player1.getText();
	}

	public String getplayer2() {
		return player2.getText();
	}
}
