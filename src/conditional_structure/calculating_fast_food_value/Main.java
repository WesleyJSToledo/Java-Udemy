package conditional_structure.calculating_fast_food_value;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int requestId, quantityProduct;
		double totalValue = 0.0;
		
		System.out.println("Product ID: ");
		requestId = sc.nextInt();
		
		System.out.println("Quantity: ");
		quantityProduct = sc.nextInt();
		
		switch (requestId) {
			case 1:
				totalValue = 4.0 * quantityProduct;
				break;
			case 2:
				totalValue = 4.5 * quantityProduct;
				break;
			case 3:
				totalValue = 5.0 * quantityProduct;
				break;
			case 4:
				totalValue = 2.0 * quantityProduct;
				break;
			case 5:
				totalValue = 1.5 * quantityProduct;
				break;
			default:
				System.out.println("Invalid Request!!");
				break;
		}
		
		System.out.printf("Final value: R$%.2f", totalValue);

		sc.close();
	}
}
