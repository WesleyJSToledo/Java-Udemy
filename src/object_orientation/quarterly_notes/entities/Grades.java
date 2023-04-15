package object_orientation.quarterly_notes.entities;

import java.util.Scanner;

public class Grades {
	private String name;
	private double firstQuarter;
	private double secondQuarter;
	private double thirdQuarter;
	private double average;
	private String state;
	
	public Grades() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Student's name:");
		name = sc.next();
		
		System.out.println("Enter notes between (0 - 100):");
		
		System.out.print("First Quarter:");
		firstQuarter = sc.nextDouble();
		
		System.out.print("Second Quarter:");
		secondQuarter = sc.nextDouble();
		
		System.out.print("Third Quarter:");
		thirdQuarter = sc.nextDouble();
		
		System.out.println();
		
		sc.close();
	}
	
	public void getAverage() {	
		average = ((firstQuarter * 30) 
				+ (secondQuarter * 35) 
				+ (thirdQuarter * 35))/100;
		
		if (average >= 60) {
			state = "Approved";
		} else {
			state = "Disapproved";
		}
	}
	
	public void printGrades() {
		System.out.println("name: " + name);
		System.out.println("average: " + average);
		System.out.println(state);
	}
}
