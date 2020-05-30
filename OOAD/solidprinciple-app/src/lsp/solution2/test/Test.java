package lsp.solution2.test;

import lsp.solution2.*;

public class Test {
	public static void main(String[] args) {
		Square square = new Square(3);
		Rectangle rect = new Rectangle(3, 5);
		printInfo(square);
		printInfo(rect);
	}

	private static void printInfo(IPolygon shape) {
		System.out.println("Area:" + shape.calculateArea());
	}
}
