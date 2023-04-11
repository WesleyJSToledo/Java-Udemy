package vectors_lists.even_number;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int quantityValues, quantityEven = 0;

		System.out.println("How many values ​​will you enter: ");
		quantityValues = sc.nextInt();

		int[] values = new int[quantityValues];

		for (int i = 0; i < values.length; i++) {
			System.out.println("Enter the " + (i + 1) + "th Value: ");
			values[i] = sc.nextInt();
		}

		System.out.println("Even numbers: ");
		for (int value : values) {
			if (value % 2 == 0) {
				System.out.print(value + " ");
				quantityEven++;
			}
		}
		
		System.out.println();
		System.out.println("Has " +quantityEven+ " Even Numbers");
		
		sc.close();
	}

}
