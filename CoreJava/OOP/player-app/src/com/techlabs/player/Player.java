package com.techlabs.player;

public class Player {
	private String name;
	private int age;
	private int id;

	private static int playerID;
	static {
		playerID = 1000;
	}

	public Player(String name, int age) {
		this.name = name;
		this.age = age;
		 playerID++;
	}

	public int getID() {
		return playerID;
	}
}
