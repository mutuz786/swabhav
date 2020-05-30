package lsp.solution1;

public class NonFixedWidthShape {
	private int side;

	public NonFixedWidthShape(int side) {
		this.side = side;
	}

	public int calculateArea() {
		return side * side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
}
