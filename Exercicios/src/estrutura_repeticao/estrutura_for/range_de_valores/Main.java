package estrutura_repeticao.estrutura_for.range_de_valores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lerValor = new Scanner(System.in);
		
		int n = 0, base = 0;
		int in = 0, out = 0;
		
		System.out.println("Digite quantos termos: ");
		n = lerValor.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite o " +(i+1)+ "º valor: ");
			base = lerValor.nextInt();
			
			if(base >= 10 && base <= 20) {
				in++; 
			} else {
				out++;
			}
		}
		System.out.println("Valores entre [10, 20]");
		System.out.println("Dentro: " +in);
		System.out.println("Fora: " +out);

		lerValor.close();
	}

}
