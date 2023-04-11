package repetition_structure.structure_for.dividers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int value;
		
		System.out.println("Enter a value: ");
		value = sc.nextInt();
		
		System.out.println("Dividers: ");
		for (int i = 1; i <= value; i++) {
			if(value % i == 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}
}
