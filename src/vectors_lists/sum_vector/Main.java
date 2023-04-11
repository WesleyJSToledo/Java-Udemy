package vectors_lists.sum_vector;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quantityValues;
		double sum = 0, average;
		
		System.out.println("How many numbers are you going to type?");
		quantityValues = sc.nextInt();
		
		double [] values = new double [quantityValues];
		
		for(int i = 0; i < values.length; i++) {
			System.out.print("Enter the " + (i+1) + " Value: ");
			values [i] = sc.nextDouble();
		}
		System.out.print("Values: ");
		for(double value : values) {
			System.out.print(value+ " ");
			sum += value;
		}
		
		average = sum / quantityValues;
		System.out.println();
		System.out.println("Sum: " +sum);
		System.out.println("The average is: " + average);
		
		sc.close();
	}

}
