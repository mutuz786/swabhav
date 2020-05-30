package lsp.solution1;

public class FixedWidthShape {
	private int height;
	private int width;

	public FixedWidthShape(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public int calculateArea() {
		return height * width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
}
