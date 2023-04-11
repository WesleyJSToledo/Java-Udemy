package sequential_structure.area_calculation;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a, b, c;
		double triangle, circle, trapeze, square, rectangle;
		
		System.out.println("Value A: ");
		a = scanner.nextDouble();
		
		System.out.println("Value B: ");
		b = scanner.nextDouble();
		
		System.out.println("Value C: ");
		c = scanner.nextDouble();
		
		triangle = a * c / 2.0;
		circle = 3.14159 * c * c;
		trapeze = (a + b) / 2.0 * c;
		square = b * b;
		rectangle = a * b;
		
		System.out.printf("Triangle: %.3f%n", triangle);
		System.out.printf("Circle: %.3f%n", circle);
		System.out.printf("Trapeze: %.3f%n", trapeze);
		System.out.printf("Square: %.3f%n", square);
		System.out.printf("Rectangle: %.3f%n", rectangle);

		scanner.close();
	}
}
