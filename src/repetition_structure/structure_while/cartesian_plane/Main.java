package repetition_structure.structure_while.cartesian_plane;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x = 1, y = 1;
		
		boolean option  = false;
		
		while(option == false) {
			System.out.println("Enter the X coordinate: ");
			x = sc.nextDouble();
			
			System.out.println("Enter the Y coordinate: ");
			y = sc.nextDouble();
			
			option = (x == 0 && y == 0) ? true : false;
			
			if (x > 0 && y > 0) {
				System.out.println("First");
			} else if (x <= 0 && y > 0) {
				System.out.println("Second");
			} else if (x <= 0 && y <= 0) {
				System.out.println("Third");
			} else if (x > 0 && y <= 0) {
				System.out.println("Fourth");
			} else {
				System.out.println("End of Program");
			}
		}

		sc.close();
	}
}
