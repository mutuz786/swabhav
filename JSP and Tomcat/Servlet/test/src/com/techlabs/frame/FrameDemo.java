package com.techlabs.frame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

import javax.swing.*;

public class FrameDemo {
	static JFrame frame = new JFrame("demo");
	static JLabel printer = new JLabel();
	static JButton hello = new JButton();
	static JButton printTime = new JButton();
	static Thread t = null;

	public static void main(String[] args) {
		hello.setText("Hello");
		hello.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (t == null)
					printer.setText("hello");
			}
		});

		printTime.setText("Print Time");
		printTime.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Runnable runnable = new Runnable() {
					@Override
					public void run() {
						while (true) {
							printer.setText(LocalDateTime.now().toString());
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
				};

				t = new Thread(runnable);
				t.start();
			}
		});

		frame.add(hello);
		frame.add(printTime);
		frame.add(printer);
		frame.setLayout(new FlowLayout());
		frame.setSize(200, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
