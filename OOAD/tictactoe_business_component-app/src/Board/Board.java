package Board;

public class Board {
	private Cell[] cells;

	public Board() {
		cells = new Cell[9];
		for (int i = 0; i < 9; i++)
			cells[i] = new Cell();
	}

	public void addMark(int location, Mark mark) throws RuntimeException {
		if (location < 9 && location >= 0) {
			cells[location].addMark(mark);
			return;
		}
		throw new RuntimeException("Add valid position");
	}

	public boolean isFull() {
		for (Cell cell : cells) {
			if (cell.getMark() == Mark.EMPTY)
				return false;
		}
		return true;
	}

	public Cell getCell(int position) {
		return cells[position];
	}

	public Cell[] getCells() {
		return cells;
	}
}