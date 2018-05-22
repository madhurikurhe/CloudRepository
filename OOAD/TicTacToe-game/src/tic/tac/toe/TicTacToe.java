package tic.tac.toe;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TicTacToe extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel p = new JPanel();
	JFrame frame = new JFrame("COLLIN");
	XOButton buttons[] = new XOButton[9];

	public static void main(String[] args) {
		new TicTacToe();
	}

	public TicTacToe() {
		super("TicTacToe");
		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer();
		Player[] player = new Player[2];

		Game game = new Game(player, result, board);
		GameState state;

		setSize(400, 400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		p.setLayout(new GridLayout(3, 3));
		for (int i = 0; i < 9; i++) {
			buttons[i] = new XOButton(game);
			buttons[i].putClientProperty("id", Integer.valueOf(i));
			p.add(buttons[i]);

		}

		add(p);
		setVisible(true);
		game.initGame();
		JLabel label = new JLabel("My label");
		player[0] = new Player("Madhu", Mark.CROSS);
		player[1] = new Player("Trisha", Mark.NOUGHT);

		do {
			if (game.getCurrentPlayer() == Mark.CROSS) {

				JTextField statusBar = new JTextField("Madhu's Turn");
				statusBar.setEditable(false);
				add(statusBar, BorderLayout.PAGE_START);

			} else {
				JTextField statusBar = new JTextField("Trisha's Turn");
				statusBar.setEditable(false);
				add(statusBar, BorderLayout.PAGE_START);
			}

			try {

			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}

		} while (game.getCurrentState() == GameState.PLAYING);

		if (game.getCurrentState() != GameState.DRAW) {
			if (game.getCurrentPlayer() == Mark.CROSS)

				JOptionPane.showMessageDialog(null, "Congradulations!!!"
						+ player[1].getPlayerName() + " Won Game");

			else

				JOptionPane.showMessageDialog(null, "Congradulations!!!"
						+ player[0].getPlayerName() + " Won Game");

		} else
			JOptionPane.showMessageDialog(null, "Game draw");
	}

}
