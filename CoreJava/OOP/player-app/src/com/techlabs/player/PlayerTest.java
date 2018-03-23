package com.techlabs.player;

public class PlayerTest {
	public static void main(String[] args) {
		Player p1 = new Player("Sachin", 30);
		Player p2 = new Player("Prasad", 40);
		Player p3 = new Player("Prasad", 40);
		System.out.println("P1 ID is:" + p1.getID());
		System.out.println("P2 ID is:" + p2.getID());
		System.out.println("P1 ID is:" + p1.getID());
		System.out.println("P3 ID is:" + p3.getID());
		System.out.println("P2 ID is:" + p2.getID());
	}
}
