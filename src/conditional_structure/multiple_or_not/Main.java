package conditional_structure.multiple_or_not;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int firstNumber, secondNumber;
		
		System.out.println("First Number: ");
		firstNumber = sc.nextInt();
		
		System.out.println("Second Number: ");
		secondNumber = sc.nextInt();
		
		if(firstNumber % secondNumber == 0 
				|| secondNumber % firstNumber == 0) {
			
			System.out.println("Are Multiples");
		} else {
			System.out.println("Aren't Multiples");
		}

		sc.close();
	}
}