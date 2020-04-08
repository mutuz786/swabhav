package com.techlabs.csvtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CsvTest {
	public static void main(String[] args) throws IOException {
		Product[] products = new Product[10];
		products = getProduct();
		for (Product product : products) {
			if (product != null)
				printInfo(product);
		}

	}

	private static Product[] getProduct() throws IOException {
		String fileName = "products.csv";
		Path path = Paths.get(fileName);
		BufferedReader buffer = Files.newBufferedReader(path);
		return initializedProduct(buffer);
	}

	private static Product[] initializedProduct(BufferedReader buffer) throws IOException {
		Product[] products = new Product[10];
		int index = 0;
		String line = buffer.readLine();
		for (int i = 0; i < 10; i++) {
			line = buffer.readLine();
			if (line != null) {
				String[] attributes = line.split(",");
				if (attributes.length > 2) {
					attributes = cleanInput(attributes);
					products[index] = addProduct(attributes);
					index++;
				}
			}

		}
		return products;
	}

	private static Product addProduct(String[] attributes) {
		int id = Integer.parseInt(attributes[0]);
		String item = attributes[1];
		int price = Integer.parseInt(attributes[2]);
		double discount = Double.parseDouble(attributes[3]);
		Product product = new Product(id, item, price, discount);
		return product;
	}

	private static String[] cleanInput(String[] product) {
		for (int i = 0; i < product.length; i++) {
			product[i] = product[i].trim();
		}
		return product;
	}

	private static void printInfo(Product product) {
		System.out.println(product.getId() + " " + product.getItem() + " " + product.getPrice() + " "
				+ product.getDiscount() + " " + product.calculatePrice());
	}
}
