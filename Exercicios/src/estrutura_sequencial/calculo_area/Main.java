package estrutura_sequencial.calculo_area;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner lerValores = new Scanner(System.in);
		
		double a, b, c;
		double triangulo, circulo, trapezio, quadrado, retangulo;
		
		System.out.println("Valor A: ");
		a = lerValores.nextDouble();
		
		System.out.println("Valor B: ");
		b = lerValores.nextDouble();
		
		System.out.println("Valor C: ");
		c = lerValores.nextDouble();
		
		triangulo = a * c / 2.0;
		circulo = 3.14159 * c * c;
		trapezio = (a + b) / 2.0 * c;
		quadrado = b * b;
		retangulo = a * b;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);

		lerValores.close();
	}
}
