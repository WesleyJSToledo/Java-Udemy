package object_orientation.dollar_converter.entities;


public class Dollar {
	
	public static final double IOF = 0.06;
	
	public static double conversor(double price, double value) {
		return price * value * (1.0 + IOF);
	}
	
	
}
