package pattern;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		int k = 0;
		for (char i = 'a'; i <= 'p'; i++) {
			System.out.print(i + " ");
			k++;
			if (k == 4) {
				System.out.println();
				k = 0;
			}
		}

		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Number:");
		String name = s.nextLine();
	}
}
