package com.techlabs.player;

public class Player {
	private String name;
	private int age;
	private static int playerID = 1000;
	private int id;

	public Player(String name, int age) {
		this.name = name;
		this.age = age;
		id = playerID++;
	}

	public int getID() {
		return id;
	}
}
