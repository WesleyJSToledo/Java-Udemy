package repetition_structure.structure_for.factorial;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = 0, factorial = 1;
		
		System.out.println("Enter a value: ");
		number = sc.nextInt();
		
		if(number == 0) {
			System.out.println("Factorial is: 1");
		} else {
			for (int i = number; i > 1; i--) {
				factorial = factorial * i;
			}
			System.out.println("Factorial is: " + factorial);
		}

		sc.close();
	}
}
