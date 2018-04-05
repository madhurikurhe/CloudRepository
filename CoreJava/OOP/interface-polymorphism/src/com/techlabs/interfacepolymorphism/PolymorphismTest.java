package com.techlabs.interfacepolymorphism;

public class PolymorphismTest {
	public static void main(String[] args) {
		PolymorphismTest test = new PolymorphismTest();
		Man man = new Man();
		Boy boy = new Boy();
		//test.atTheMovies(man);
		test.atTheMovies(boy);
		test.atTheParty(man);
		test.atTheParty(boy);
	}

	private void atTheMovies(IEmotional obj) {
		obj.cry();
		obj.laugh();
	}

	private void atTheParty(Imanable obj) {
		obj.desire();
		obj.wish();
	}

}
