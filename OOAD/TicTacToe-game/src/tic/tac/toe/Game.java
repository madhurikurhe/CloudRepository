package tic.tac.toe;

public class Game {
	private Board board;
	private GameState currentState;
	private Mark currentPlayer;
	private ResultAnalyzer result;

	public Game(Player[] player, ResultAnalyzer result, Board board) {
		this.result = result;
		this.board = board;
	}

	public void initGame() {
		currentPlayer = Mark.CROSS;
		currentState = GameState.PLAYING;
	}

	public void changePlayer() {
		currentPlayer = (currentPlayer == Mark.CROSS) ? Mark.NOUGHT
				: Mark.CROSS;
	}

	public boolean play(int cellNumber) throws Exception {

		if (board.validMove(cellNumber)) {
			board.getCells()[cellNumber].setMark(getCurrentPlayer());
			board.currentRow = cellNumber;
			return true;
		} else {
			throw new Exception("Invalid Entry!!!! try again");
		}

	}

	public GameState updateGame() {
		return result.analyze(board);

	}

	public GameState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(GameState currentState) {
		this.currentState = currentState;
	}

	public Mark getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(Mark currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

}
