package com.techlabs.model;

import java.io.*;

public class CsvExporter {
	private Writer writer;

	public CsvExporter(String filename) {
		try {
			File file = new File(filename);
			writer = new FileWriter(file);
			writer.write(
					"CustID,CustName,CustAddress,OrderId,OrderDate,OrderCheckoutCost,ItemId,ItemQuantity,ProductId,ProductName,ProductPrice,ProductDiscount\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void add(Customer customer) {
		String printText = customer.getId() + "," + customer.getName() + "," + customer.getAddress() + ",";
		try {
			add(printText, customer);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void add(String text, Customer customer) throws Exception {
		for (Order order : customer.getOrders()) {
			String text1 = order.getId() + "," + order.getDate() + "," + order.checkoutCost() + ",";
			text += text1;
			add(text, order);
			text = text.replaceAll(text1, "");
		}
	}

	private void add(String text, Order order) throws Exception {
		for (LineItem item : order.getItems()) {
			Product product = item.getProduct();
			String text1 = item.getId() + "," + item.getQuantity() + "," + product.getId() + "," + product.getName()
					+ "," + product.getPrice() + "," + product.getDiscountPercentage() + "\n";
			text += text1;
			writer.write(text);
			text = text.replaceAll(text1, "");
		}
	}
}
