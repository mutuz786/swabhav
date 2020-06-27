package com.techlabs.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommonListner implements ActionListener {
	private static CommonListner listener;

	private CommonListner() {

	}

	public static ActionListener getInstance() {
		if (listener == null) {
			listener = new CommonListner();
		}
		return listener;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("you have chosen " + e.getActionCommand() + " color");
	}
}
