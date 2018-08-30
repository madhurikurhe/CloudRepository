package tic.tac.toe.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import tic.tac.toe.Board;
import tic.tac.toe.Game;
import tic.tac.toe.GameState;
import tic.tac.toe.Mark;
import tic.tac.toe.Player;
import tic.tac.toe.ResultAnalyzer;

public class GameTest {
	ResultAnalyzer r = new ResultAnalyzer();
	Board b = new Board();
	Player[] player = null;
	Game game = new Game(player, r, b);

	@Test
	public void shouldChangePlayer() {

		game.setCurrentPlayer(Mark.CROSS);
		game.changePlayer();
		assertTrue(Mark.NOUGHT == game.getCurrentPlayer());

		game.setCurrentPlayer(Mark.NOUGHT);
		game.changePlayer();
		assertTrue(Mark.CROSS == game.getCurrentPlayer());

	}

	@Test
	public void shouldSetCurrentStateToCrossWon() {
		game.setCurrentState(GameState.WON);
		assertTrue(GameState.WON == game.getCurrentState());
	}

	@Test
	public void shouldSetCurrentStateToNaughtWon() {

		game.setCurrentState(GameState.WON);
		assertTrue(GameState.WON == game.getCurrentState());
	}

	@Test
	public void shouldSetCurrentStateToDrawGame() {

		game.setCurrentState(GameState.DRAW);
		assertTrue(GameState.DRAW == game.getCurrentState());
	}

	@Test
	public void shouldSetCurrentPlayerToCross() {

		game.setCurrentPlayer(Mark.CROSS);
		assertTrue(Mark.CROSS == game.getCurrentPlayer());
	}

	@Test
	public void shouldSetCurrentPlayerToNaught() {

		game.setCurrentPlayer(Mark.NOUGHT);
		assertTrue(Mark.NOUGHT == game.getCurrentPlayer());
	}

	@Test
	public void shouldSetCurrentPlayerToEmpty() {

		game.setCurrentPlayer(Mark.EMPTY);
		assertTrue(Mark.EMPTY == game.getCurrentPlayer());
	}

}
