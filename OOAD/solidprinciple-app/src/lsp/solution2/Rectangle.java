package lsp.solution2;

public class Rectangle implements IPolygon {
	private int length;
	private int breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}

	@Override
	public int calculateArea() {
		return length * breadth;
	}

}
