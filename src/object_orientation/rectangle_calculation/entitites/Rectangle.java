package object_orientation.rectangle_calculation.entitites;

import java.util.Scanner;

public class Rectangle {
	private double height;
	private double base;

	public Rectangle() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base value of the rectangle: ");
		base = sc.nextDouble();
		
		System.out.println("Enter the height value of the rectangle:");
		height = sc.nextDouble();
		
		sc.close();
	}
	
	public double area() {
		return(height * base);
	}
	
	public double perimeter() {
		return (2 * (height + base));
	}
	
	public double diagonal() {
		return (Math.sqrt((base * base) + (height * height)));
	}
}
