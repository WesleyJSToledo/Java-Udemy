package repetition_structure.structure_for.weighted_averages;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double firstGrade, secondGrade, thirdGrade, avg;
		int numGrades;
		
		System.out.println("Enter how many you will register: ");
		numGrades = sc.nextInt();
		
		for (int i = 1; i <= numGrades; i++) {
			System.out.println(i+"º student");
			
			System.out.print("1st Grade:");
			firstGrade = sc.nextDouble();
			

			System.out.print("2st Grade:");
			secondGrade = sc.nextDouble();
			

			System.out.print("3st Grade:" );
			thirdGrade = sc.nextDouble();
			
			avg = ((firstGrade * 2) + (secondGrade * 3) + (thirdGrade * 5)) / 10;
			
			System.out.println("Weighted average: " + avg);
		}

		sc.close();
	}
}
