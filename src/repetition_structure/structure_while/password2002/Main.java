package repetition_structure.structure_while.password2002;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int password = 2002, key = 0;
		
		while(key != password) {
			System.out.println("Enter the password: ");
			key = sc.nextInt();
			
			if (key != password) {
				System.out.println("Invalid Password");
			} else {
				System.out.println("Access allowed");
			}
			System.out.println();
		}

		sc.close();
	}

}
