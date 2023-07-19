package stream.products_csv.entities;

public class Product {
	private String name;
	private double value;
	
	public Product(String name,	double value){
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public double getValue() {
		return value;
	}
}
