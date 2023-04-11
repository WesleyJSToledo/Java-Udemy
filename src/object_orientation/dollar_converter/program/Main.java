package object_orientation.dollar_converter.program;

import java.util.Scanner;

import object_orientation.dollar_converter.entities.Dollar;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dollar price: ");
		double price = sc.nextDouble();
		
		System.out.print("How many dollars do you need: ");
		double value = sc.nextDouble();

		System.out.printf("You need R$ %.2f", Dollar.conversor(price, value));
		
		sc.close();
	}

}
