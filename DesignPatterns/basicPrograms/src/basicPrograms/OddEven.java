package basicPrograms;

public class OddEven {

	public static void main(String args[]) {

		int number = 2;
		do {
		if (number % 2 == 0) {

				System.out.println("even=" + number);

			}

			else {
				System.out.println("odd=" + number);

			}

			number++;

		} while (number <= 10);
	}

}
