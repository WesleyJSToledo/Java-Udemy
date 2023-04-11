package vectors_lists.negatives;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quantityValues, base;
		
		System.out.println("How many numbers are you going to type?");
		quantityValues = sc.nextInt();
		
		int [] values = new int [quantityValues];
		
		for(int i = 0; i < values.length; i++) {
			System.out.print("Enter the "+(i+1)+" Value: ");
			base = sc.nextInt();
			
			if (base <= 10) {
				values [i] = base;
			} else {
				System.out.println("Invalid value!!\nPlease enter a value less than 1010\n");
				i--;
			}
		}
		
		System.out.println("Negative numbers: ");
		for (int value : values) {
			if (value < 0) {
				System.out.println(value);
			}
		}
		
		sc.close();
	}
	
	
}
