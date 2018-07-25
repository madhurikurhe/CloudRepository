package basic;

public class P {
	private int foo = 10;

	public P(int foo) {
		System.out.println("P is created");
		this.foo = foo;
	}

	public int getFoo() {
		return foo;
	}
}
