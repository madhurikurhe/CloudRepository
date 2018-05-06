package tic.tac.toe;

public class GameConsole {

	public static void main(String[] args) {
		Game game = new Game();
		game.initGame();
		do {
			Mark currentPlayer = game.getCurrentPlayer();
			if (game.getCurrentPlayer() == Mark.CROSS) {
				System.out
						.print("Player 'X', enter your move (Cell no between[1-9]): ");
			} else {
				System.out
						.print("Player 'O', enter your move (Cell no between[1-9]): ");
			}
			game.playerMove(currentPlayer);

			game.updateGame(currentPlayer);

			game.changePlayer();
		} while (game.getCurrentState() == GameState.PLAYING);
		System.out.println( game.getCurrentState() +" Game");
	}

}
