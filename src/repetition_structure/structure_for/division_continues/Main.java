package repetition_structure.structure_for.division_continues;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int  numRepetitions;
		double firstValue, secondValue, division;
		
		System.out.println("How many division will be made: ");
		numRepetitions = sc.nextInt();
		
		for (int i = 1; i <= numRepetitions; i++) {
			System.out.println("First value: ");
			firstValue = sc.nextDouble();
			
			System.out.println("Second Value: ");
			secondValue = sc.nextDouble();
			
			if(secondValue == 0) {
				System.out.println("Impossible Division!");
			} else {
				division = firstValue / secondValue;
				System.out.println("Division is: " + division);
			}
		}

		sc.close();
	}
}
