package man.test;

import man.Boy;
import man.Infants;
import man.Kid;
import man.Man;
	
public class ManTest {
	public static void main(String args[]) {
		 //case1();
		//case2();
		 case3();
		//case4();

	}

	private static void case4() {
		playGround(new Man());
		playGround(new Boy());
		playGround(new Infants());
		playGround(new Kid());

	}

	private static void playGround(Man man) {
		man.play();
	}

	private static void case3() {
		
	Man	x = new Boy();
		x.read();
		x.walk();
		x.play();
		((Boy) x).eat();
		
		
	}

	private static void case2() {
		Boy b = new Boy();
		b.read();
		b.play();
		b.walk();
		b.eat();
	}

	private static void case1() {
		Man m = new Man();
		m.read();
		m.play();
		m.walk();
	}
}
