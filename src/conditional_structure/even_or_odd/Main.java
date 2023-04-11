package conditional_structure.even_or_odd;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		System.out.println("Number: ");
		number = sc.nextInt();
		
		if(number % 2 != 0) {
			System.out.println("ODD");
		} else {
			System.out.println("Even");
		}

		sc.close();
	}

}
