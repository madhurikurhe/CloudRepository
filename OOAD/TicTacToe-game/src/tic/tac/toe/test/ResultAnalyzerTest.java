package tic.tac.toe.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import tic.tac.toe.Board;
import tic.tac.toe.Mark;
import tic.tac.toe.ResultAnalyzer;

public class ResultAnalyzerTest {

	@Test
	public void hasWonTestFirstRow() {
		Board board = new Board();
		ResultAnalyzer analyzer=new ResultAnalyzer();
		board.getCells()[0].setMark(Mark.CROSS);
		board.getCells()[1].setMark(Mark.CROSS);
		board.getCells()[2].setMark(Mark.CROSS);
		boolean expected=true;
		boolean actual=analyzer.hasWon(Mark.CROSS, board);
		assertTrue(expected==actual);
	}
	
	@Test
	public void hasWonTestSecondRow() {
		Board board = new Board();
		ResultAnalyzer analyzer=new ResultAnalyzer();
		board.getCells()[3].setMark(Mark.CROSS);
		board.getCells()[4].setMark(Mark.CROSS);
		board.getCells()[5].setMark(Mark.CROSS);
		boolean expected=true;
		boolean actual=analyzer.hasWon(Mark.CROSS, board);
		assertTrue(expected==actual);
	}
	
	@Test
	public void hasWonTestThirdRow() {
		Board board = new Board();
		ResultAnalyzer analyzer=new ResultAnalyzer();
		board.getCells()[6].setMark(Mark.CROSS);
		board.getCells()[7].setMark(Mark.CROSS);
		board.getCells()[8].setMark(Mark.CROSS);
		boolean expected=true;
		boolean actual=analyzer.hasWon(Mark.CROSS, board);
		assertTrue(expected==actual);
	}
	
	@Test
	public void hasWonTestFirstDiagonal() {
		Board board = new Board();
		ResultAnalyzer analyzer=new ResultAnalyzer();
		board.getCells()[0].setMark(Mark.CROSS);
		board.getCells()[4].setMark(Mark.CROSS);
		board.getCells()[8].setMark(Mark.CROSS);
		boolean expected=true;
		boolean actual=analyzer.hasWon(Mark.CROSS, board);
		assertTrue(expected==actual);
	}
	
	@Test
	public void hasWonTestSecondDiagonal() {
		Board board = new Board();
		ResultAnalyzer analyzer=new ResultAnalyzer();
		board.getCells()[2].setMark(Mark.CROSS);
		board.getCells()[4].setMark(Mark.CROSS);
		board.getCells()[6].setMark(Mark.CROSS);
		boolean expected=true;
		boolean actual=analyzer.hasWon(Mark.CROSS, board);
		assertTrue(expected==actual);
	}
	
	
	
	
	
		
}
