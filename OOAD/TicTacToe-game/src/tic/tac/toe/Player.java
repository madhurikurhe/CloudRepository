package tic.tac.toe;

public class Player {
	private String playerName;

	public Player(String name, Mark mark) {
		this.setPlayerName(name);
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

}
