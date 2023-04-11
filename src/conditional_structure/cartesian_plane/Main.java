package conditional_structure.cartesian_plane;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		String coordinates;
		
		System.out.println("Coordinates X: ");
		x = sc.nextDouble();

		System.out.println("Coordinates Y: ");
		y = sc.nextDouble();
		
		if(x == 0 && y == 0) {
			coordinates = "Origin";
			
		} else if(y >= 0 && x >= 0) {
				coordinates = "Q1";
		
		} else if(y >= 0 && x <= 0){
				coordinates = "Q2";
		
		} else if(y <= 0 && x <= 0){
				coordinates = "Q3";
		
		} else {
				coordinates = "Q4";
		}
		
		System.out.println(coordinates);

		sc.close();
	}
}
