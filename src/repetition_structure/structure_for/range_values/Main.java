package repetition_structure.structure_for.range_values;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0, base = 0;
		int in = 0, out = 0;
		
		System.out.println("Enter how many terms: ");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the " +(i+1)+ "st value: ");
			base = sc.nextInt();
			
			if(base >= 10 && base <= 20) {
				in++; 
			} else {
				out++;
			}
		}
		System.out.println("Values ​​between [10, 20]");
		System.out.println("In: " + in);
		System.out.println("Out: " + out);

		sc.close();
	}

}
