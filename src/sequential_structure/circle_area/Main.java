package sequential_structure.circle_area;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double area, radius;
		
		System.out.println("Enter the Radius of the Circle: ");
		radius = sc.nextDouble();
		
		area = Math.PI * Math.pow(radius, 2);
		
		System.out.println("Area = " +area);
		
		sc.close();
	}

}
