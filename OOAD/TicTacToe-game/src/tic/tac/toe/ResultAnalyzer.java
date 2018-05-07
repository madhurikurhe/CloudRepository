package tic.tac.toe;


public class ResultAnalyzer {
	public boolean hasWon(Board board) {
		if (checkFirstRow(board))
			return true;

		else if(checkSecondRow(board))
			return true;
		
		else if(checkThirdRow(board))
			return true;
		
		else if(checkFirstColumn(board))
			return true;
		
		else if(checkSecondColumn(board))
			return true;
		
		else if(checkThirdColumn(board))
			return true;
		
		else if(checkFirstDiagonal(board))
			return true;
		
		else if(checkSecondDiagonal(board))
			return true;
		
		return false;
	}

	public boolean checkThirdRow(Board board) {
		if(board.getCells()[7].getMark()!=Mark.EMPTY)
		if( board.getCells()[6].getMark() == board.getCells()[7].getMark()
				&& board.getCells()[7].getMark() == board.getCells()[8]
						.getMark())
			return true;
		return false;
	}

	public boolean checkSecondRow(Board board) {
		if(board.getCells()[3].getMark()!=Mark.EMPTY)
		if( board.getCells()[3].getMark() == board.getCells()[4].getMark()
				&& board.getCells()[3].getMark() == board.getCells()[5]
						.getMark())
			return true;
		return false;
	}

	public boolean checkFirstRow(Board board) {
		if(board.getCells()[0].getMark()!=Mark.EMPTY)
		if( board.getCells()[0].getMark() == board.getCells()[1].getMark()
				&& board.getCells()[0].getMark() == board.getCells()[2]
						.getMark())
			return true;
		return false;
	}

	public boolean checkFirstColumn(Board board) {
		if(board.getCells()[3].getMark()!=Mark.EMPTY)
		if( board.getCells()[0].getMark() == board.getCells()[3].getMark()
				&& board.getCells()[3].getMark() == board.getCells()[6]
						.getMark())
		return true;
		return false;
	}

	public boolean checkSecondColumn(Board board) {
		if(board.getCells()[1].getMark()!=Mark.EMPTY)
		if( board.getCells()[1].getMark() == board.getCells()[4].getMark()
				&& board.getCells()[1].getMark() == board.getCells()[7]
						.getMark())
		return true;
		return false;
	}

	public boolean checkThirdColumn(Board board) {
		if(board.getCells()[2].getMark()!=Mark.EMPTY)
		if( board.getCells()[2].getMark() == board.getCells()[5].getMark()
				&& board.getCells()[2].getMark() == board.getCells()[8]
						.getMark())
			return true;
			return false;
	}

		
	public boolean checkFirstDiagonal(Board board) {
		if(board.getCells()[0].getMark()!=Mark.EMPTY)
		if( board.getCells()[0].getMark() == board.getCells()[4].getMark()
				&& board.getCells()[0].getMark() == board.getCells()[8]
						.getMark())
			return true;
			return false;
	}
		
	public boolean checkSecondDiagonal(Board board) {
		if(board.getCells()[2].getMark()!=Mark.EMPTY)
		if( board.getCells()[2].getMark() == board.getCells()[4].getMark()
				&& board.getCells()[2].getMark() == board.getCells()[6]
						.getMark())
			return true;
			return false;
	}
		
		
	public GameState analyze(Board board) {
		if (hasWon(board)) {
			return GameState.WON;
		} else if (board.isBoardFull()) {
			return GameState.DRAW;
		} else
			return GameState.PLAYING;

	}

	
}
