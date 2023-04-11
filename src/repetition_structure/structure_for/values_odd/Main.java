package repetition_structure.structure_for.values_odd;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Enter the X value: ");
		x = sc.nextInt();
		
		System.out.println("Odd Values: ");
		for(int i = 0; i <= x; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}

}
