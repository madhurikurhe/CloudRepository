package com.techlabs.exception.test;

import java.io.IOException;

import com.techlabs.exception.Checked;
import com.techlabs.exception.UnChecked;

public class ExceptionTest {
	public static void main(String args[]) throws IOException {
		Checked checked = new Checked();
		UnChecked unchecked = new UnChecked();

		unchecked.unCheckedException();
		// checked.checkedException();

	}
}
