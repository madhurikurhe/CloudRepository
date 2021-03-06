package com.techlabs.tic.tac.toe;

public class Cell {
	Mark content; 
	int row, col; 

	public Cell(int row, int col) {
		this.row = row;
		this.col = col;
		clear(); 
	}

	public void clear() {
		content = Mark.EMPTY;
	}

	public void paint() {
		switch (content) {
		case CROSS:
			System.out.print(" X ");
			break;
		case NOUGHT:
			System.out.print(" O ");
			break;
		case EMPTY:
			System.out.print("   ");
			break;
		}
	}
}
