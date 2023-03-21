/*
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lerValores = new Scanner(System.in);
		
		int a, b, c, d;
		double diferenca;
		
		System.out.println("Digite o Primeiro Valor: ");
		a = lerValores.nextInt();
		
		System.out.println("Digite o Segundo Valor: ");
		b = lerValores.nextInt();
		
		System.out.println("Digite o Terceiro Valor: ");
		c = lerValores.nextInt();
		
		System.out.println("Digite o Quarto Valor: ");
		d = lerValores.nextInt();
		
		diferenca = (a * b - c * d);
		
		System.out.println("Difereça= " +diferenca);

		lerValores.close();
	}

}
