package object_orientation.enums.product_order.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import object_orientation.enums.product_order.entities.enums.OrderStatus;

public class Order {
	
	private Date moment;
	private Client client;
	private OrderStatus status;
	
	List <OrderItem> items = new  ArrayList<>();

	public Order(Date moment, Client client, OrderStatus status) {
		this.moment = moment;
		this.client = client;
		this.status = status;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		double sum = 0;
		for(OrderItem item : items) {
			sum += item.subTotal();
		}
		
		return sum;
	}

	@Override
	public String toString() {
		return  "Order moment: " + moment + 
				"\nOrder Stauts: " + status + 
				"\nClient: " + client + 
				"\nOrder items: \n" + items;
	}
	
	
}
