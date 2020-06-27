package com.techlabs.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmailListner implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("You have placed an order-email");
	}
}
