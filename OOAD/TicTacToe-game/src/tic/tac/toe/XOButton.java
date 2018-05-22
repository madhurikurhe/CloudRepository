package tic.tac.toe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class XOButton extends JButton implements ActionListener {
	ImageIcon x, o;
	byte value = 0;
	Game game;

	public XOButton(Game game) {
		x = new ImageIcon(this.getClass().getResource("x3.png"));
		o = new ImageIcon(this.getClass().getResource("o1.png"));
		this.addActionListener(this);
		this.game = game;

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton b = (JButton) e.getSource();
		int cellLocation = 0;
		Object property = b.getClientProperty("id");
		if (property instanceof Integer) {
			cellLocation = ((Integer) property);
		}

		Mark currentPlayer = game.getCurrentPlayer();
		switch (currentPlayer) {
		case EMPTY:
			setIcon(null);
			break;
		case CROSS:
			setIcon(x);
			break;

		case NOUGHT:
			setIcon(o);
			break;

		}
		try {
			game.play(cellLocation);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		GameState state = game.updateGame();
		game.setCurrentState(state);
		game.getCurrentPlayer();
		game.changePlayer();

	}

}
