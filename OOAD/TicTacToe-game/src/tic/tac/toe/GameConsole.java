package tic.tac.toe;

public class GameConsole {

	public static void main(String[] args) {
		Game game = new Game();
		GameState state;
		Mark winner;
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

			state = game.updateGame(currentPlayer);
			game.setCurrentState(state);
			System.out.println(state);
			winner=game.getCurrentPlayer();
			game.changePlayer();
		} while (game.getCurrentState() == GameState.PLAYING);
		System.out.println(winner + " Won  Game");
	}
}
