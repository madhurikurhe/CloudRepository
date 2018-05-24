package tic.tac.toe;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TicTacToe extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel panel = new JPanel();
	JFrame frame = new JFrame("ticTacToe");
	JButton buttons[] = new JButton[9];
	ImageIcon x, o;
	Board board = new Board();
	ResultAnalyzer result = new ResultAnalyzer();
	Player[] player = new Player[2];
	Game game = new Game(player, result, board);
	GameState state;
	JButton reset = new JButton();

	public static void main(String[] args) {
		new TicTacToe();
	}

	public TicTacToe() {
		super("TicTacToe");

		setSize(500, 500);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel.setLayout(new GridLayout(3, 3));

		JTextField statusBar1 = new JTextField("Madhu's Turn(X)");
		statusBar1.setEditable(false);
		add(statusBar1, BorderLayout.SOUTH);

		for (int i = 0; i < 9; i++) {
			buttons[i] = new JButton();
			x = new ImageIcon(this.getClass().getResource("x1.png"));
			o = new ImageIcon(this.getClass().getResource("o1.png"));
			buttons[i].addActionListener(this);
			buttons[i].putClientProperty("id", Integer.valueOf(i));
			panel.add(buttons[i]);
		}

		add(panel);
		setVisible(true);
		game.initGame();
		player[0] = new Player("Madhu", Mark.CROSS);
		player[1] = new Player("Trisha", Mark.NOUGHT);

	}

	private void displayDetails() {

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
			buttons[cellLocation].setIcon(null);
			break;
		case CROSS:
			buttons[cellLocation].setIcon(x);
			break;

		case NOUGHT:
			buttons[cellLocation].setIcon(o);
			break;

		}
		try {
			game.play(cellLocation);
			if (game.getCurrentState() != GameState.PLAYING)
				displayDetails();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		if (game.getCurrentPlayer() == Mark.CROSS) {

			JTextField statusBar = new JTextField("Madhu's Turn(X)");
			statusBar.setEditable(false);
			add(statusBar, BorderLayout.SOUTH);

		} else {
			JTextField statusBar = new JTextField("Trisha's Turn(O)");
			statusBar.setEditable(false);
			add(statusBar, BorderLayout.SOUTH);
		}

	}
}
