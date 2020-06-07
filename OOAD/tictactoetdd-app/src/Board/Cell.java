package Board;

public class Cell {
	private Mark mark;

	public Cell() {
		mark = Mark.EMPTY;
	}

	public Mark getMark() {
		return mark;
	}

	public void addMark(Mark mark) throws RuntimeException {
		if (this.mark == Mark.EMPTY) {
			this.mark = mark;
			return;
		}
		throw new RuntimeException("Cell already taken");
	}
}
