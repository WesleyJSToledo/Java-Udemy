package sequential_structure.sum_value;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int firstValue, secondValue, sum;
		
		System.out.println("Enter First Value: ");
		firstValue = sc.nextInt();
		
		System.out.println("Enter Second Value: ");
		secondValue = sc.nextInt();
		
		sum = firstValue + secondValue;
		
		System.out.println("Sum = " +sum);

		sc.close();
	}
}
