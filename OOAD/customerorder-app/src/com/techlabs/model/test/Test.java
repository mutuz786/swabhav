package com.techlabs.model.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import com.techlabs.model.*;

public class Test {
	public static void main(String[] args) throws ParseException {
		Product book = new Product(UUID.randomUUID(), "book", 1562.12, 0.25f);
		Product pen = new Product(UUID.randomUUID(), "pen", 10, 0.05f);
		Product bag = new Product(UUID.randomUUID(), "bag", 754, 0.3f);
		Product rubber = new Product(UUID.randomUUID(), "rubber", 20, 0.01f);
		LineItem bookItem = new LineItem(UUID.randomUUID(), 21, book);
		LineItem penItem = new LineItem(UUID.randomUUID(), 3, pen);
		LineItem bagItem = new LineItem(UUID.randomUUID(), 6, bag);
		LineItem rubberItem = new LineItem(UUID.randomUUID(), 2, rubber);
		Order order1 = new Order(UUID.randomUUID(), toDate("23-MAY-2020"));
		order1.addItem(bookItem);
		order1.addItem(penItem);
		Order order2 = new Order(UUID.randomUUID(), toDate("21-APR-2020"));
		order2.addItem(rubberItem);
		order2.addItem(bagItem);
		Order order3 = new Order(UUID.randomUUID(), toDate("12-JAN-2020"));
		Order order4 = new Order(UUID.randomUUID(), toDate("26-FEB-2020"));
		Order order5 = new Order(UUID.randomUUID(), toDate("14-JUNE-2020"));
		Customer kishore = new Customer(UUID.randomUUID(), "Kishore", "mumbai");
		kishore.addOrder(order1);
		kishore.addOrder(order2);
		Customer vishal = new Customer(UUID.randomUUID(), "vishal", "Thane");
		vishal.addOrder(order3);
		vishal.addOrder(order4);
		vishal.addOrder(order5);
		printInfo(kishore);
		CsvExporter export = new CsvExporter("customerorder.csv");
		export.add(kishore);
		export.add(vishal);
	}

	private static void printInfo(Customer customer) {
		System.out.println("CustomerId:" + customer.getId() + "\nName:" + customer.getName() + "\nAddress:"
				+ customer.getAddress() + "\nOrder:");
		for (Order order : customer.getOrders()) {
			printInfo(order);
		}
	}

	private static void printInfo(Order order) {
		System.out.println("\tOrderId:" + order.getId() + "\n\tOrderDate:" + order.getDate() + "\n\tCheckoutCost:"
				+ order.checkoutCost() + "\n\tItem:");
		for (LineItem item : order.getItems()) {
			printInfo(item);
		}
	}

	private static void printInfo(LineItem item) {
		System.out.println("\t\tItemId:" + item.getId() + "\n\t\tQuantity:" + item.getQuantity() + "\n\t\tProductId:"
				+ item.getProduct().getId() + "\n\t\tProductName:" + item.getProduct().getName() + "\n\t\tProductPrice:"
				+ item.getProduct().getPrice() + "\n\t\tProductCost:" + item.getProduct().totalCost() + "\n");
	}

	private static Date toDate(String date) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		return dateFormat.parse(date);
	}
}
