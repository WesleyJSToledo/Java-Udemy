/*
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lerValores = new Scanner(System.in);
		
		double area, raio;
		
		System.out.println("Digite o Raio do Circulo: ");
		raio = lerValores.nextDouble();
		
		area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("Area = " +area);
		
		lerValores.close();
	}

}
