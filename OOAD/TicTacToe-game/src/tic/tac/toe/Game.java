package tic.tac.toe;

import java.util.Scanner;

public class Game {
	private Board board;
	private GameState currentState;
	private Mark currentPlayer;
	private static Scanner in = new Scanner(System.in);
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

	public void playerMove(Mark player) {
		boolean validInput = false;
		do {

			int row = in.nextInt() - 1;

			if (!board.invalidMove(row)) {
				board.getCells()[row].setMark(player);
				board.currentRow = row;
				validInput = true;
			} else {
				System.out.println("This move at (" + (row + 1)
						+ ") is not valid. Try again...");
			}
		} while (!validInput);
	}

	public GameState updateGame(Mark mark) {
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
