public class Test {
	static int i = -1;

	public Test(int j) {
		switch (j % 2) {
		case 0:
			System.out.println("Even");
			break;
		case 1:
			System.out.println("Odd");
			break;

		}
	}

	public void increment() {
		++i;
	}

	public void decrement() {
		--i;
	}

	public static void main(String[] args) {
		Test op = new Test(2);
		op.decrement();
		op.increment();
		int j = 120;
		System.out.println(j);
		System.out.println(j++);
		System.out.println(++j);
		int x = 99;
		int y = 100;
		y = (x * y) / (x = y);
		System.out.println(x);
		System.out.println(y);
		
		char a='A';
		int b=97;
		float c=20.123f;
		double d=30.120;
		
		a=b;
		b=c;
		c=d;
		d=a;
		
	}

}
