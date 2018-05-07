package tic.tac.toe;

public class Cell {

	private Mark mark;

	public Cell() {
		this.mark = Mark.EMPTY;
	}

	public Mark getMark() {
		return mark;
	}

	public void setMark(Mark mark) {
		if (getMark() == Mark.EMPTY)
			this.mark = mark;
		else
			throw new RuntimeException("Invalid");
	}

}
