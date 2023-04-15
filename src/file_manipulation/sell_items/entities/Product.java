package file_manipulation.sell_items.entities;

public class Product {

	private String name;
	private double value;
	private double souldAmount;
	
	public Product(String name, double value, double souldAmount) {
		this.name = name;
		this.value = value;
		this.souldAmount = souldAmount;
	}
	
	public String getName() {
		return name;
	}

	public double getValue() {
		return value;
	}

	public double getSouldAmount() {
		return souldAmount;
	}

	@Override
	public String toString() {
		return name + "," + value + "," + souldAmount;
	}

}
