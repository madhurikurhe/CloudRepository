package tic.tac.toe.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import tic.tac.toe.Board;
import tic.tac.toe.GameState;
import tic.tac.toe.Mark;
import tic.tac.toe.ResultAnalyzer;

public class ResultAnalyzerTest {
	Board board = new Board();
	ResultAnalyzer analyzer = new ResultAnalyzer();

	@Test
	public void hasWonTestFirstRow() {

		board.setLocation(0, Mark.CROSS);
		board.setLocation(1, Mark.CROSS);
		board.setLocation(2, Mark.CROSS);

		boolean expected = true;
		boolean actual = analyzer.hasWon(board);
		assertTrue(expected == actual);
	}

	@Test
	public void hasWonTestSecondRow() {
		board.setLocation(3, Mark.CROSS);
		board.setLocation(4, Mark.CROSS);
		board.setLocation(5, Mark.CROSS);

		boolean expected = true;
		boolean actual = analyzer.hasWon(board);
		assertTrue(expected == actual);
	}

	@Test
	public void hasWonTestThirdRow() {
		board.setLocation(6, Mark.CROSS);
		board.setLocation(7, Mark.CROSS);
		board.setLocation(8, Mark.CROSS);

		boolean expected = true;
		boolean actual = analyzer.hasWon(board);
		assertTrue(expected == actual);
	}

	@Test
	public void hasWonTestFirstColumn() {
		board.setLocation(0, Mark.CROSS);
		board.setLocation(3, Mark.CROSS);
		board.setLocation(6, Mark.CROSS);

		boolean expected = true;
		boolean actual = analyzer.hasWon(board);
		assertTrue(expected == actual);
	}

	@Test
	public void hasWonTestSecondColumn() {
		board.setLocation(1, Mark.CROSS);
		board.setLocation(4, Mark.CROSS);
		board.setLocation(7, Mark.CROSS);

		boolean expected = true;
		boolean actual = analyzer.hasWon(board);
		assertTrue(expected == actual);
	}

	@Test
	public void hasWonTestThirdColumn() {
		board.setLocation(2, Mark.CROSS);
		board.setLocation(5, Mark.CROSS);
		board.setLocation(8, Mark.CROSS);

		boolean expected = true;
		boolean actual = analyzer.hasWon(board);
		assertTrue(expected == actual);
	}

	@Test
	public void hasWonTestFirstDiagonal() {
		board.setLocation(0, Mark.CROSS);
		board.setLocation(4, Mark.CROSS);
		board.setLocation(8, Mark.CROSS);

		boolean expected = true;
		boolean actual = analyzer.hasWon(board);
		assertTrue(expected == actual);
	}

	@Test
	public void hasWonTestSecondDiagonal() {
		board.setLocation(2, Mark.CROSS);
		board.setLocation(4, Mark.CROSS);
		board.setLocation(6, Mark.CROSS);

		boolean expected = true;
		boolean actual = analyzer.hasWon(board);
		assertTrue(expected == actual);
	}

	@Test
	public void checkIsBoardFull() {
		board.setLocation(0, Mark.CROSS);
		board.setLocation(1, Mark.CROSS);
		board.setLocation(2, Mark.CROSS);
		board.setLocation(3, Mark.CROSS);
		board.setLocation(4, Mark.CROSS);
		board.setLocation(5, Mark.CROSS);
		board.setLocation(6, Mark.CROSS);
		board.setLocation(7, Mark.CROSS);
		board.setLocation(8, Mark.CROSS);
		boolean state = board.isBoardFull();
		assertTrue(true == state);
	}

	@Test
	public void checkIfReturnsPlaying() {
		ResultAnalyzer result = new ResultAnalyzer();
		board.setLocation(6, Mark.CROSS);
		board.setLocation(7, Mark.NOUGHT);
		board.setLocation(8, Mark.CROSS);
		GameState state = result.analyze(board);
		assertTrue(GameState.PLAYING == state);
	}

}
