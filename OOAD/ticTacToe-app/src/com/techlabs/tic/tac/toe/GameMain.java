package com.techlabs.tic.tac.toe;

import java.util.Scanner;


public class GameMain {
	private Board board; 
	private GameState currentState; 
	private Mark currentPlayer; 
	private static Scanner in = new Scanner(System.in); 

	public GameMain() {
		board = new Board(); 

		initGame();
		do {
			playerMove(currentPlayer); 
			board.paint(); 
			updateGame(currentPlayer);
			if (currentState == GameState.CROSS_WON) {
				System.out.println("'X' won! Bye!");
			} else if (currentState == GameState.NOUGHT_WON) {
				System.out.println("'O' won! Bye!");
			} else if (currentState == GameState.DRAW) {
				System.out.println("It's Draw! Bye!");
			}
			currentPlayer = (currentPlayer == Mark.CROSS) ? Mark.NOUGHT
					: Mark.CROSS;
		} while (currentState == GameState.PLAYING);
	}

	public void initGame() {
		board.init(); 
		currentPlayer = Mark.CROSS; 
		currentState = GameState.PLAYING; 
	}

	
	public void playerMove(Mark theSeed) {
		boolean validInput = false; 
		do {
			if (theSeed == Mark.CROSS) {
				System.out
						.print("Player 'X', enter your move (row[1-3] column[1-3]): ");
			} else {
				System.out
						.print("Player 'O', enter your move (row[1-3] column[1-3]): ");
			}
			int row = in.nextInt() - 1;
			int col = in.nextInt() - 1;
			if (row >= 0 && row < Board.ROWS && col >= 0 && col < Board.COLS
					&& board.cells[row][col].content == Mark.EMPTY) {
				board.cells[row][col].content = theSeed;
				board.currentRow = row;
				board.currentCol = col;
				validInput = true; 
			} else {
				System.out.println("This move at (" + (row + 1) + ","
						+ (col + 1) + ") is not valid. Try again...");
			}
		} while (!validInput); 
	}

	public void updateGame(Mark theSeed) {
		if (board.hasWon(theSeed)) { 
			currentState = (theSeed == Mark.CROSS) ? GameState.CROSS_WON
					: GameState.NOUGHT_WON;
		} else if (board.isDraw()) { 
			currentState = GameState.DRAW;
		}
	}

	public static void main(String[] args) {
		new GameMain(); 
	}
}
