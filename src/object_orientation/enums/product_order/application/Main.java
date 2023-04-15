package object_orientation.enums.product_order.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import object_orientation.enums.product_order.entities.Client;
import object_orientation.enums.product_order.entities.Order;
import object_orientation.enums.product_order.entities.OrderItem;
import object_orientation.enums.product_order.entities.Product;
import object_orientation.enums.product_order.entities.enums.OrderStatus;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.println("Enter cliente data: ");
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Birth date (DD/MM/YYYY): ");
			Date birthDate = SDF.parse(sc.next());

			System.out.println("Enter order data: ");
			System.out.print("Status: ");
			OrderStatus orderStatus = OrderStatus.valueOf(sc.next());

			Order order = new Order(new Date(), new Client(name, email, birthDate), orderStatus);

			System.out.print("How many items to this order? ");
			int items = sc.nextInt();
			
			for(int i = 1; i <= items; i++) {
				System.out.println("Enter #" + i + " item data: " );
				
				System.out.print("Product name: ");
				sc.nextLine();
				String productName = sc.nextLine();
				
				System.out.print("Product price: ");
				double productPrice = sc.nextDouble();
				
				System.out.print("Quantity: ");
				int productQuantity = sc.nextInt();
				
				order.addItem(new OrderItem(productQuantity, productPrice, new Product(productName, productPrice)));
			}
			
			System.out.println("ORDER SUMMARY: ");
			System.out.println(order);
			
			System.out.println("Total price: " + order.total());
			
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}
}
