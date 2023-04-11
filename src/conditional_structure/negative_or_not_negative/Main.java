package conditional_structure.negative_or_not_negative;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		System.out.println("Number: ");
		number = sc.nextInt();
		
		if(number < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Not Negative");
		}
		
		sc.close();
	}

}
