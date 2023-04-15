package sequential_structure.salary;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int employeeNumber;
		double hourWorked, valueTime, salary;
		
		System.out.println("Enter your number: ");
		employeeNumber = sc.nextInt();
		
		System.out.println("Time Value: ");
		valueTime = sc.nextDouble();
		
		System.out.println("How many hours do you work per month: ");
		hourWorked = sc.nextDouble();
		
		salary = hourWorked * valueTime;
		
		System.out.println("Number: " +employeeNumber);
		System.out.println("Salary: R$" +salary);

		sc.close();
	}
}
