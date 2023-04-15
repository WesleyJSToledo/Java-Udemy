package sequential_structure.difference_abcd;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c, d;
		double difference;
		
		System.out.println("Enter First Value: ");
		a = scanner.nextInt();
		
		System.out.println("Enter Second Value: ");
		b = scanner.nextInt();
		
		System.out.println("Enter Third Value: ");
		c = scanner.nextInt();
		
		System.out.println("Enter Fourth Value: ");
		d = scanner.nextInt();
		
		difference = (a * b - c * d);
		
		System.out.println("Difference: " +difference);

		scanner.close();
	}

}
