package tic.tac.toe;


public class Game {
	private Board board;
	private GameState currentState;
	private Mark currentPlayer;

	ResultAnalyzer result = new ResultAnalyzer();
	public Game() {
		board = new Board();
	}

	public void initGame() {
		currentPlayer = Mark.CROSS;
		currentState = GameState.PLAYING;
	}

	public void changePlayer() {
		currentPlayer = (currentPlayer == Mark.CROSS) ? Mark.NOUGHT
				: Mark.CROSS;
	}

	public void play(int cellNumber) {
		boolean validInput = false;
		do {

			if (!board.invalidMove(cellNumber)) {
				board.getCells()[cellNumber].setMark(getCurrentPlayer());
				board.currentRow = cellNumber;
				validInput = true;
			} else {
				System.out.println("This move at (" + (cellNumber + 1)
						+ ") is not valid. Try again...");
			}
		} while (!validInput);
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

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	
}
