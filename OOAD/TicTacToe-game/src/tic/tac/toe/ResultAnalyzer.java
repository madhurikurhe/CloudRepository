package tic.tac.toe;

public class ResultAnalyzer {
	public boolean hasWon(Mark mark, Board board) {

		if (board.getCells()[0].getMark() == mark
				&& board.getCells()[1].getMark() == mark
				&& board.getCells()[2].getMark() == mark)
			return true;
		else if (board.getCells()[3].getMark() == mark
				&& board.getCells()[4].getMark() == mark
				&& board.getCells()[5].getMark() == mark)
			return true;
		else if (board.getCells()[6].getMark() == mark
				&& board.getCells()[7].getMark() == mark
				&& board.getCells()[8].getMark() == mark)
			return true;
		else if (board.getCells()[0].getMark() == mark
				&& board.getCells()[4].getMark() == mark
				&& board.getCells()[8].getMark() == mark)
			return true;
		else if (board.getCells()[2].getMark() == mark
				&& board.getCells()[4].getMark() == mark
				&& board.getCells()[6].getMark() == mark)
			return true;
		else
			return false;
	}

}
