package vectors_lists.below_average;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 0, divider = 0;
		double[] values;
		List<Double> belowAverage = new ArrayList<Double>();
		double sum = 0, avg = 0;

		System.out.println("Enter how many values ​​will you enter: ");
		n = sc.nextInt();

		values = new double[n];

		for (int i = 0; i < values.length; i++) {
			System.out.print("Enter the " + (i+1) + "st value: ");
			values[i] = sc.nextDouble();

			if (values[i] >= 10) {
				sum += values[i];
				divider++;
			} else {
				belowAverage.add(values[i]);
			}
		}

		avg = sum / divider;

		System.out.println("Average :" + avg);
		System.out.println("Below Average: ");

		for (double i : belowAverage) {
			System.out.println(i);
		}

		sc.close();
	}

}
