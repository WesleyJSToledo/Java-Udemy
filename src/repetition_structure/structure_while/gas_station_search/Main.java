package repetition_structure.structure_while.gas_station_search;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int option = 0;
		int ethanol = 0, gasoline = 0, diesel = 0;
		
		while (option != 4) {
			System.out.println("PESQUISA DO POSTO");
			System.out.println(":1 Ethanol");
			System.out.println(":2 Gasoline");
			System.out.println(":3 Diesel");
			System.out.println(":4 Leave");
			
			System.out.print("Enter an option: ");
			option = sc.nextInt();
			
			System.out.println("\n");
			
			switch (option){
			case 1:
				ethanol++;
				break;
			case 2:
				gasoline++;
				break;
			case 3:
				diesel++;
				break;
			case 4:
				System.out.println("THANK YOU");
				break;
				
			default:
				System.out.println("Enter a valid option");
			}
		}
		
		System.out.println("Ethanol: " + ethanol);
		System.out.println("Gasoline: " + gasoline);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}

}
