package lsp.solution1.test;

import lsp.solution1.*;

public class Test {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(200, 100);
		shouldNotChangeWidth_IfHeightIsModified(rect);
		Square square=new Square(100);
		//shouldNotChangeWidth_IfHeightIsModified(square);
	}

	private static void shouldNotChangeWidth_IfHeightIsModified(Rectangle rect) {
		int beforeW = rect.getWidth();
		rect.setHeight(rect.getHeight() + 100);
		int afterW = rect.getWidth();
		System.out.println(beforeW == afterW);
	}
}
