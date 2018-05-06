package tic.tac.toe;

public class Board {
	public static final int noOfCell = 9;

	private Cell[] cells;
	int currentRow, currentCol;

	public Board() {
		cells = new Cell[noOfCell];
		for (int row = 0; row < noOfCell; ++row) {
			cells[row] = new Cell();

		}
	}

	public Cell[] getCells() {
		return cells;
	}

	public void setCells(Cell[] cells) {
		this.cells = cells;
	}

	public int getCurrentRow() {
		return currentRow;
	}

	public void setCurrentRow(int currentRow) {
		this.currentRow = currentRow;
	}


	public void init() {
		for (int row = 0; row < noOfCell; ++row) {
			cells[row].clear();
		}
	}

	public boolean isDraw() {
		for (int row = 0; row < noOfCell; ++row) {
			if (cells[row].getMark() == Mark.EMPTY) {
				return false;
			}
		}

		return true;
	}

}
