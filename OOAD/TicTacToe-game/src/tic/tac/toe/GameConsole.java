package tic.tac.toe;

import java.util.Scanner;

public class GameConsole {

	public static void main(String[] args) {

		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer();
		Player[] player = new Player[2];

		Game game = new Game(player, result, board);
		GameState state;

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		game.initGame();

		System.out.println("Enter First Player Name:");
		String player1 = in.nextLine();

		System.out.println("Enter Second Player Name:");
		String player2 = in.nextLine();

		player[0] = new Player(player1, Mark.CROSS);
		player[1] = new Player(player2, Mark.NOUGHT);

		do {
			if (game.getCurrentPlayer() == Mark.CROSS) {
				System.out.print(player[0].getPlayerName()
						+ " Enter your move (Cell number between[1-9]): ");
			} else {
				System.out.print(player[1].getPlayerName()
						+ " Enter your move (Cell number between[1-9]): ");
			}
			int cellNumber = in.nextInt() - 1;

			try {

				game.play(cellNumber);
				paintBoard(board);
				state = game.updateGame();
				game.setCurrentState(state);
				game.getCurrentPlayer();
				game.changePlayer();

			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}

		} while (game.getCurrentState() == GameState.PLAYING);

		if (game.getCurrentState() != GameState.DRAW) {
			if (game.getCurrentPlayer() == Mark.CROSS)
				System.out.println("Congradulations!!!"
						+ player[1].getPlayerName() + " Won Game");
			else
				System.out.println("Congradulations!!!"
						+ player[0].getPlayerName() + " Won Game");
		} else
			System.out.println("Sorry...Game Draw");
	}

	private static void paintBoard(Board board) {
		for (int i = 0; i < 9; i++) {
			if (i == 3 || i == 6)
				System.out.println();
			paintCell(i, board);
		}

		System.out.print("\n");

	}

	private static void paintCell(int j, Board board) {
		Cell[] cell = board.getCells();
		Mark mark = cell[j].getMark();
		if (mark == Mark.CROSS)
			System.out.print("\tX");
		else if (mark == Mark.NOUGHT)
			System.out.print("\tO");
		else
			System.out.print("\t");
	}

}