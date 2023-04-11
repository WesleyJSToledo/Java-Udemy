package vectors_lists.approved.entities;

import java.util.Scanner;

public class Students {
	private String name;
	private double[] grades;

	public Students(int i) {
		Scanner sc = new Scanner(System.in);

		grades = new double[2];

		System.out.println("Enter the name of the " + (i+1) + "st Student: ");
		this.name = sc.next();

		System.out.println("Enter the 1st Semester grade:");
		this.grades[0] = sc.nextDouble();

		System.out.println("Enter the 2st Semester grade:");
		this.grades[1] = sc.nextDouble();
		
		System.out.println();
		
		sc.close();
	}

	public double avg() {
		return ((this.grades[0] + this.grades[1]) / 2);
	}
	public String getName() {
		return this.name;
	}
}
