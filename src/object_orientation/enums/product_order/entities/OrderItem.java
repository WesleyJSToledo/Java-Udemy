package object_orientation.enums.product_order.entities;

public class OrderItem {
	private Integer quantity;
	private Double price;

	private Product product;

	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Double getPrice() {
		return price;
	}

	public Product getProduct() {
		return product;
	}
	
	public Double subTotal() {
		return quantity * price;
	}

	@Override
	public String toString() {
		return product.getName() + ", $" + price + ", Quantity: " + quantity + ", Subtotal: " + subTotal();
	}
	
	
}
