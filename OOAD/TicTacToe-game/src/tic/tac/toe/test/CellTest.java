package tic.tac.toe.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import tic.tac.toe.Cell;
import tic.tac.toe.Mark;

public class CellTest {

	@Test
	public void shouldMarkCellWithCross() {
		Cell c = new Cell();

		Mark expected = Mark.CROSS;
		c.setMark(Mark.CROSS);

		assertTrue(expected == c.getMark());
	}

	@Test
	public void shouldMarkCellWithNaught() {
		Cell c = new Cell();

		Mark expected = Mark.NOUGHT;
		c.setMark(Mark.NOUGHT);

		assertTrue(expected == c.getMark());
	}

	@Test
	public void shouldMarkCellEmpty() {
		Cell c = new Cell();

		Mark expected = Mark.EMPTY;
		c.setMark(Mark.EMPTY);

		assertTrue(expected == c.getMark());
	}

	@Test(expected=RuntimeException.class)
	public void shouldNotMarkIfAlreadyMark()   {
		    Cell c = new Cell();
			
		    c.setMark(Mark.CROSS);
		    c.getMark();
		    
		    c.setMark(Mark.NOUGHT);
		    
		    
	
	}

	
}
