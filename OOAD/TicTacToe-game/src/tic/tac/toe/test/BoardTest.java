package tic.tac.toe.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import tic.tac.toe.Board;
import tic.tac.toe.Cell;
import tic.tac.toe.Mark;

public class BoardTest {

	@Test
	public void testToCheckIsBoardFull() {
		Board b = new Board();
		boolean status = b.isBoardFull();
		boolean expectedStatus = false;
		assertTrue(expectedStatus == status);
	}

	@Test
	public void testToCheckIsBoardClear() {
		// Board b = new Board();
		Cell c = new Cell();
		// b.init();
		assertTrue(c.getMark() == Mark.EMPTY);

	}

	@Test
	public void testToCheckInvalidMove() {
		Board b = new Board();
		b.setCurrentRow(10);
		boolean actual = b.validMove(b.getCurrentRow());
		assertTrue(true == actual);
	}

}
