package vectors_lists.sum_vectors;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		double [] valueA, ValueB;
		
		System.out.println("How many values ​​will you enter:");
		n = sc.nextInt();
		
		valueA = new double [n];
		ValueB = new double [n];
		
		for (int i = 0; i < valueA.length; i++) {
			System.out.print("Enter the " +(i+1)+ "th value of array A:");
			valueA[i] = sc.nextDouble();
		}
		
		System.out.println();
		for (int i = 0; i < ValueB.length; i++) {
			System.out.print("Enter the " +(i+1)+ "th value of array B:");
			ValueB[i] = sc.nextDouble();
		}
		
		System.out.println();
		for (int i = 0; i < valueA.length; i++) {
			System.out.println("Sum of" +(i+1)+ "values:" +(valueA[i] + ValueB[i]));
		}
		
		sc.close();
	}

}
