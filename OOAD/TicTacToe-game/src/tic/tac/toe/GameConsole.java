package tic.tac.toe;

import java.util.Scanner;

public class GameConsole {

	public static void main(String[] args) {
		
		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer();
		Game game = new Game();
		GameState state;
		Mark winner;
		Scanner in = new Scanner(System.in);
		game.initGame();

		do {
			if (game.getCurrentPlayer() == Mark.CROSS) {
				System.out
						.print("Player 'X', enter your move (Cell number between[1-9]): ");
			} else {
				System.out
						.print("Player 'O', enter your move (Cell number between[1-9]): ");
			}
			int cellNumber = in.nextInt() - 1;

			game.play(cellNumber);
			state = game.updateGame();
			game.setCurrentState(state);
			winner = game.getCurrentPlayer();
			game.changePlayer();
		} while (game.getCurrentState() == GameState.PLAYING);

		if (state != GameState.DRAW)
			System.out.println(winner + " Won  Game");
		else
			System.out.println("Game Draw");
	}

}