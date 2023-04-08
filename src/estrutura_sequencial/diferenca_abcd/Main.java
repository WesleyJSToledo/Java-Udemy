package estrutura_sequencial.diferenca_abcd;


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
