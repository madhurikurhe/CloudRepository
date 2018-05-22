package tic.tac.toe;

public class Board {
	public static final int noOfCell = 9;

	private Cell[] cells;
	int currentRow, currentCol;
	private Cell cell;

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

	public boolean isBoardFull() {
		for (int row = 0; row < noOfCell; ++row) {
			if (cells[row].getMark() == Mark.EMPTY) {
				return false;
			}
		}

		return true;
	}

	public boolean validMove(int cellNumber) {
		if (cellNumber >= 0 && cellNumber < Board.noOfCell
				&& getCells()[cellNumber].getMark() == Mark.EMPTY)
			return true;
		return false;

	}

	public void setLocation(int cellNumber, Mark mark) {

		cells[cellNumber].setMark(mark);
	}

	public Cell getLocation(int cellNumber) {

		return cell;

	}
}
