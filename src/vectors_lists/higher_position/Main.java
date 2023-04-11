package vectors_lists.higher_position;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0, position = 0;
		double [] values;
		double bigger = 0;
		
		System.out.println("Enter How many values ​​will you enter: ");
		n = sc.nextInt();
		
		values = new double[n];
		
		for(int i = 0; i < values.length; i++) {
			System.out.print("Enter the " +(i+1)+ "th value: ");
			values[i] = sc.nextDouble();
			
			if (i == 0) {
				bigger = values[i];
			} else if (values[i] > values[i - 1]) {
					bigger = values[i];
					position = i;
				}
		}
			
		System.out.println("Bigger value: " + bigger);
		System.out.println("Position of bigger value: "+ (position+1));
		
		sc.close();
	}

}
