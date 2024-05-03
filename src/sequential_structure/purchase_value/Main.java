package sequential_structure.purchase_value;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codProduct, quantityProduct;
		double valueProduct, amount;
		
		System.out.println("First Product: ");
		
		System.out.println("Product code: ");
		codProduct = sc.nextInt();
		
		System.out.println("Quantity of Products: ");
		quantityProduct = sc.nextInt();
		
		System.out.println("Product Value:");
		valueProduct = sc.nextDouble();
		
		amount = quantityProduct * valueProduct;
		
		System.out.println("First Product: ");

		System.out.println("Product code: ");
		codProduct = sc.nextInt();
		
		System.out.println("Quantity of Products: ");
		quantityProduct = sc.nextInt();
		
		System.out.println("Product Value:");
		valueProduct = sc.nextDouble();
		
		amount += quantityProduct * valueProduct;
		
		System.out.println("Cod Product: " + codProduct);
		System.out.println("Amount: R$" +amount);
		
		sc.close();
	}

}
