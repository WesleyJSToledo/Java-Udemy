package object_orientation.employee.entities;

import java.util.Scanner;

public class Employee {
	
	private String name;
	private double grossSalary;
	private double tax;
	
	public void registerEmployee() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Employee's name: ");
		name = sc.next();
		
		System.out.print("Enter gross salary: \nR$");
		grossSalary = sc.nextDouble();
		
		System.out.println("Enter the Tax Percentage: ");
		tax = sc.nextInt();
		sc.close();
	}
	
	public void print() {
		System.out.println("Name: " +this.name);
		System.out.println("Salary: " +this.grossSalary);
		System.out.println();
	}

	public void calculateNetSalary() {
		grossSalary += grossSalary  * (tax /100);
	}
}
