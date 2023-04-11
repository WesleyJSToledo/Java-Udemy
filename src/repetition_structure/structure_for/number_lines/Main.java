package repetition_structure.structure_for.number_lines;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numLines, first, second, third;
		
		System.out.println("Enter the Line Numbers: ");
		numLines = sc.nextInt();
		
		for(int i = 1; i <= numLines; i++) {
			first = i;
			second = (int) Math.pow(i, 2);
			third = (int) Math.pow(i, 3);
			System.out.println(first + " " + second + " " + third);
		}

		sc.close();
	}

}
