package estrutura_condicional.negativo_ou_nao_negativo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lerNumero = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Numero: ");
		numero = lerNumero.nextInt();
		
		if(numero < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NÃO NEGATIVO");
		}
		
		lerNumero.close();
	}

}
