package tic.tac.toe.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import tic.tac.toe.Game;
import tic.tac.toe.GameState;
import tic.tac.toe.Mark;

public class GameTest {
	
	@Test
	public void shouldChangePlayer(){
		Game game=new Game();
		
		game.setCurrentPlayer(Mark.CROSS);
		game.changePlayer();
		assertTrue(Mark.NOUGHT==game.getCurrentPlayer());
		
		game.setCurrentPlayer(Mark.NOUGHT);
		game.changePlayer();
		assertTrue(Mark.CROSS==game.getCurrentPlayer());
		
	}
	
	@Test
	public void shouldSetCurrentStateToCrossWon() {
		Game game=new Game();
		game.setCurrentState(GameState.WON);
		assertTrue(GameState.WON == game.getCurrentState());
	}

	@Test
	public void shouldSetCurrentStateToNaughtWon() {
		Game game=new Game();
		game.setCurrentState(GameState.WON);
		assertTrue(GameState.WON == game.getCurrentState());
	}

	@Test
	public void shouldSetCurrentStateToDrawGame() {
		Game game=new Game();
		game.setCurrentState(GameState.DRAW);
		assertTrue(GameState.DRAW == game.getCurrentState());
	}
	
	@Test
	public void shouldSetCurrentPlayerToCross() {
		Game game=new Game();
		game.setCurrentPlayer(Mark.CROSS);
		assertTrue(Mark.CROSS == game.getCurrentPlayer());
	}
	
	@Test
	public void shouldSetCurrentPlayerToNaught() {
		Game game=new Game();
		game.setCurrentPlayer(Mark.NOUGHT);
		assertTrue(Mark.NOUGHT == game.getCurrentPlayer());
	}
	
	@Test
	public void shouldSetCurrentPlayerToEmpty() {
		Game game=new Game();
		game.setCurrentPlayer(Mark.EMPTY);
		assertTrue(Mark.EMPTY == game.getCurrentPlayer());
	}
	
	
	
		

}
