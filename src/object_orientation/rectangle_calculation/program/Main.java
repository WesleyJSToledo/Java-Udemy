package object_orientation.rectangle_calculation.program;

import object_orientation.rectangle_calculation.entitites.Rectangle;

public class Main {

	public static void main(String[] args) {
		Rectangle retangulo = new Rectangle();

		System.out.println("Area: " + retangulo.area());
		System.out.println("Perimetro: " + retangulo.perimeter());
		System.out.println("Diagonal: " + retangulo.diagonal());
	}

}
