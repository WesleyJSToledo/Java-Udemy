package vectors_lists.even_average;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 0, divider = 0;
		int[] values;
		double sum = 0.0, evenAvg = 0.0;

		System.out.println("Enter how many values ​​will you enter: ");
		n = sc.nextInt();

		values = new int[n];

		for (int i = 0; i < values.length; i++) {
			System.out.print("Enter the "+ (i+1) +"st value: ");
			values[i] = sc.nextInt();

			if (values[i] % 2 == 0) {
				sum += values[i];
				divider++;
			}
		}

		evenAvg = sum / divider;

		if (divider != 0) {
			System.out.println("EVEN AVERAGE: " + evenAvg);
		} else {
			System.out.println("NO EVEN NUMBER");
		}

		sc.close();
	}

}
