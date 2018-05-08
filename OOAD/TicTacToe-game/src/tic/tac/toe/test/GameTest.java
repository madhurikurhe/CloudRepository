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
	
	@Test
	public void shouldChangePlayer(){
		ResultAnalyzer r=new ResultAnalyzer();
		Board b=new Board();
		Player[] player = null;
		Game game=new Game(player,r,b);
		
		game.setCurrentPlayer(Mark.CROSS);
		game.changePlayer();
		assertTrue(Mark.NOUGHT==game.getCurrentPlayer());
		
		game.setCurrentPlayer(Mark.NOUGHT);
		game.changePlayer();
		assertTrue(Mark.CROSS==game.getCurrentPlayer());
		
	}
	
	
	@Test
	public void shouldSetCurrentStateToCrossWon() {
		ResultAnalyzer r=new ResultAnalyzer();
		Board b=new Board();
		Player[] player = null;
		Game game=new Game(player,r,b);
		
		game.setCurrentState(GameState.WON);
		assertTrue(GameState.WON == game.getCurrentState());
	}

	@Test
	public void shouldSetCurrentStateToNaughtWon() {
		ResultAnalyzer r=new ResultAnalyzer();
		Board b=new Board();
		Player[] player = null;
		Game game=new Game(player,r,b);
		
		game.setCurrentState(GameState.WON);
		assertTrue(GameState.WON == game.getCurrentState());
	}

	@Test
	public void shouldSetCurrentStateToDrawGame() {
		ResultAnalyzer r=new ResultAnalyzer();
		Board b=new Board();
		Player[] player = null;
		Game game=new Game(player,r,b);
		
		game.setCurrentState(GameState.DRAW);
		assertTrue(GameState.DRAW == game.getCurrentState());
	}
	
	@Test
	public void shouldSetCurrentPlayerToCross() {
		ResultAnalyzer r=new ResultAnalyzer();
		Board b=new Board();
		Player[] player = null;
		Game game=new Game(player,r,b);
		
		game.setCurrentPlayer(Mark.CROSS);
		assertTrue(Mark.CROSS == game.getCurrentPlayer());
	}
	
	@Test
	public void shouldSetCurrentPlayerToNaught() {
		ResultAnalyzer r=new ResultAnalyzer();
		Board b=new Board();
		Player[] player = null;
		Game game=new Game(player,r,b);
		
		game.setCurrentPlayer(Mark.NOUGHT);
		assertTrue(Mark.NOUGHT == game.getCurrentPlayer());
	}
	
	@Test
	public void shouldSetCurrentPlayerToEmpty() {
		ResultAnalyzer r=new ResultAnalyzer();
		Board b=new Board();
		Player[] player = null;
		Game game=new Game(player,r,b);
		
		game.setCurrentPlayer(Mark.EMPTY);
		assertTrue(Mark.EMPTY == game.getCurrentPlayer());
	}
	
	
	
		

}
