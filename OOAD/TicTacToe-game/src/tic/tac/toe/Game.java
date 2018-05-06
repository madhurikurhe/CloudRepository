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
		board.init();
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

			if (row >= 0 && row < Board.noOfCell
					&& board.getCells()[row].getMark() == Mark.EMPTY) {
				board.getCells()[row].setMark(player);
				board.currentRow = row;
				validInput = true;
			} else {
				invalidMove(row);
			}
		} while (!validInput);
	}

	private void invalidMove(int row) {
		System.out.println("This move at (" + (row + 1)
				+ ") is not valid. Try again...");
	}

	public void updateGame(Mark mark) {
		if (result.hasWon(mark, board)) {
			currentState = (mark == Mark.CROSS) ? GameState.CROSS_WON
					: GameState.NOUGHT_WON;
		} else if (board.isDraw()) {
			currentState = GameState.DRAW;
		}
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
